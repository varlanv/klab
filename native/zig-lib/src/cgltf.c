#define CGLTF_IMPLEMENTATION
#include "klab_glb.h"

uint32_t klab_glb_abi_version(void)
{
    return 1;
}

size_t klab_cgltf_data_size(void)
{
    return sizeof(cgltf_data);
}
