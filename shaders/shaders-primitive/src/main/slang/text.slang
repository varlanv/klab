struct TextUniforms
{
    float2 viewport;
    float2 position;
    float4 color;
};

[[vk::binding(0, 1)]] ConstantBuffer<TextUniforms> uniforms;
[[vk::binding(0, 2)]] Sampler2D atlas;

struct VertexInput
{
    float2 position : TEXCOORD0;
    float2 uv : TEXCOORD1;
};

struct VertexOutput
{
    float4 position : SV_Position;
    float2 uv : TEXCOORD0;
    float4 color : COLOR0;
};

[shader("vertex")]
VertexOutput vertexMain(VertexInput input)
{
    VertexOutput output;
    float2 pixel = uniforms.position + float2(input.position.x, -input.position.y);
    output.position = float4(2.0 * pixel.x / uniforms.viewport.x - 1.0,
                             1.0 - 2.0 * pixel.y / uniforms.viewport.y, 0.0, 1.0);
    output.uv = input.uv;
    output.color = uniforms.color;
    return output;
}

[shader("fragment")]
float4 fragmentMain(VertexOutput input) : SV_Target0
{
    return atlas.Sample(input.uv) * input.color;
}
