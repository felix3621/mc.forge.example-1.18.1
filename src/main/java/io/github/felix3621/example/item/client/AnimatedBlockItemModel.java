package io.github.felix3621.example.item.client;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.item.custom.AnimatedBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnimatedBlockItemModel extends AnimatedGeoModel<AnimatedBlockItem> {
    @Override
    public ResourceLocation getModelLocation(AnimatedBlockItem object) {
        return new ResourceLocation(Example.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AnimatedBlockItem object) {
        return new ResourceLocation(Example.MOD_ID, "textures/machine/animated_block.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AnimatedBlockItem animatable) {
        return new ResourceLocation(Example.MOD_ID, "animations/animated_block.animation.json");
    }
}
