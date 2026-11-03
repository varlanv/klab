struct PrimitiveUniforms
{
    float4 viewport;
    float4 cameraPosition;
    float4 cameraRight;
    float4 cameraUp;
    float4 cameraForward;
};

[[vk::binding(0, 1)]] ConstantBuffer<PrimitiveUniforms> uniforms;

struct VertexInput
{
    float3 position : TEXCOORD0;
    float4 color : COLOR0;
};

struct VertexOutput
{
    float4 position : SV_Position;
    float4 color : COLOR0;
};

[shader("vertex")]
VertexOutput vertex2D(VertexInput input)
{
    VertexOutput output;
    output.position = float4(2.0 * input.position.x / uniforms.viewport.x - 1.0,
                             1.0 - 2.0 * input.position.y / uniforms.viewport.y, 0.0, 1.0);
    output.color = input.color;
    return output;
}

[shader("vertex")]
VertexOutput vertex3D(VertexInput input)
{
    float3 relative = input.position - uniforms.cameraPosition.xyz;
    float3 view = float3(dot(relative, uniforms.cameraRight.xyz),
                        dot(relative, uniforms.cameraUp.xyz),
                        dot(relative, uniforms.cameraForward.xyz));
    float focal = uniforms.cameraPosition.w;
    float aspect = uniforms.viewport.x / uniforms.viewport.y;
    float nearPlane = uniforms.viewport.z;
    float farPlane = uniforms.viewport.w;
    VertexOutput output;
    output.position = float4(view.x * focal / aspect, view.y * focal,
                             (farPlane * view.z - nearPlane * farPlane) / (farPlane - nearPlane), view.z);
    output.color = input.color;
    return output;
}

[shader("fragment")]
float4 fragmentMain(VertexOutput input) : SV_Target0
{
    return input.color;
}
