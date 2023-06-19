package io.github.felix3621.example.entity.client;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {
    @Override
    public ResourceLocation getModelLocation(RaccoonEntity object) {
        return new ResourceLocation(Example.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity object) {
        return new ResourceLocation(Example.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaccoonEntity animatable) {
        return new ResourceLocation(Example.MOD_ID, "animations/raccoon.animation.json");
    }
}
