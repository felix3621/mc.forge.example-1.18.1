package io.github.felix3621.example.world.dimension;

import io.github.felix3621.example.Example;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> FELIX_DIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Example.MOD_ID, "felix_dim"));
    public static final ResourceKey<DimensionType> FELIX_DIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, FELIX_DIM_KEY.getRegistryName());

    public static void register() {
        System.out.println("Registering ModDimensions for " + Example.MOD_ID);
    }
}
