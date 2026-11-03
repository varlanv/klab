struct ModelUniforms
{
    float4 viewport;
    float4 cameraPosition;
    float4 cameraRight;
    float4 cameraUp;
    float4 cameraForward;
    float4 nodeColumn0;
    float4 nodeColumn1;
    float4 nodeColumn2;
    float4 nodeColumn3;
    float4 placement;
};

struct MaterialUniforms
{
    float4 baseColor;
    float4 surface;
};

[[vk::binding(0, 1)]] ConstantBuffer<ModelUniforms> model;
[[vk::binding(0, 2)]] Sampler2D baseColorTexture;
[[vk::binding(0, 3)]] ConstantBuffer<MaterialUniforms> material;

struct VertexInput
{
    float3 position : TEXCOORD0;
    float3 normal : TEXCOORD1;
    float2 uv : TEXCOORD2;
};

struct VertexOutput
{
    float4 position : SV_Position;
    float3 normal : TEXCOORD0;
    float2 uv : TEXCOORD1;
};

[shader("vertex")]
VertexOutput vertexMain(VertexInput input)
{
    float3 world = model.nodeColumn0.xyz * input.position.x
                 + model.nodeColumn1.xyz * input.position.y
                 + model.nodeColumn2.xyz * input.position.z + model.nodeColumn3.xyz;
    world = world * model.placement.w + model.placement.xyz;
    float3 relative = world - model.cameraPosition.xyz;
    float3 view = float3(dot(relative, model.cameraRight.xyz),
                        dot(relative, model.cameraUp.xyz),
                        dot(relative, model.cameraForward.xyz));
    float nearPlane = model.viewport.z;
    float farPlane = model.viewport.w;
    float3 cofactor0 = cross(model.nodeColumn1.xyz, model.nodeColumn2.xyz);
    float3 cofactor1 = cross(model.nodeColumn2.xyz, model.nodeColumn0.xyz);
    float3 cofactor2 = cross(model.nodeColumn0.xyz, model.nodeColumn1.xyz);
    float orientation = sign(dot(model.nodeColumn0.xyz, cofactor0));
    VertexOutput output;
    output.position = float4(view.x * model.cameraPosition.w * model.viewport.y / model.viewport.x,
                             view.y * model.cameraPosition.w,
                             (farPlane * view.z - nearPlane * farPlane) / (farPlane - nearPlane), view.z);
    output.normal = orientation * (cofactor0 * input.normal.x + cofactor1 * input.normal.y + cofactor2 * input.normal.z);
    output.uv = input.uv;
    return output;
}

[shader("fragment")]
float4 fragmentMain(VertexOutput input) : SV_Target0
{
    float4 color = baseColorTexture.Sample(input.uv) * material.baseColor;
    if (material.surface.x >= 0.0 && color.a < material.surface.x) discard;
    float light = material.surface.y > 0.5 ? 1.0
        : 0.45 + 0.55 * max(dot(normalize(input.normal), normalize(float3(-0.4, 0.8, 0.6))), 0.0);
    float3 linear = max(color.rgb * light, 0.0);
    float3 srgb = 1.055 * pow(linear, float3(1.0 / 2.4)) - 0.055;
    return float4(lerp(linear * 12.92, srgb, step(0.0031308, linear)), 1.0);
}
