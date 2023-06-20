package io.github.felix3621.example.entity.client.armor;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.item.custom.CitrineArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CitrineArmorModel extends AnimatedGeoModel<CitrineArmorItem> {
    @Override
    public ResourceLocation getModelLocation(CitrineArmorItem object) {
        return new ResourceLocation(Example.MOD_ID, "geo/citrine_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CitrineArmorItem object) {
        return new ResourceLocation(Example.MOD_ID, "textures/models/armor/citrine_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CitrineArmorItem animatable) {
        return new ResourceLocation(Example.MOD_ID, "animations/armor_animation.json");
    }
}
