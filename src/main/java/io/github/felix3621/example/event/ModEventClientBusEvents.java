package io.github.felix3621.example.event;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.block.entity.ModBlockEntities;
import io.github.felix3621.example.block.entity.client.AnimatedBlockRenderer;
import io.github.felix3621.example.entity.client.armor.CitrineArmorRenderer;
import io.github.felix3621.example.item.custom.CitrineArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = Example.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(CitrineArmorItem.class, new CitrineArmorRenderer());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.ANIMATED_BLOCK_ENTITY.get(), AnimatedBlockRenderer::new);
    }
}
