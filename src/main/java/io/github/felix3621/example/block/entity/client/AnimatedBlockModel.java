package io.github.felix3621.example.block.entity.client;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.block.entity.custom.AnimatedBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnimatedBlockModel extends AnimatedGeoModel<AnimatedBlockEntity> {
    @Override
    public ResourceLocation getModelLocation(AnimatedBlockEntity object) {
        return new ResourceLocation(Example.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AnimatedBlockEntity object) {
        return new ResourceLocation(Example.MOD_ID, "textures/machine/animated_block.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AnimatedBlockEntity animatable) {
        return new ResourceLocation(Example.MOD_ID, "animations/animated_block.animation.json");
    }
}
