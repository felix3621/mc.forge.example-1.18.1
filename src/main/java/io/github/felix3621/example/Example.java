package io.github.felix3621.example;

import io.github.felix3621.example.block.ModBlocks;
import io.github.felix3621.example.effect.ModEffects;
import io.github.felix3621.example.item.ModItems;
import io.github.felix3621.example.painting.ModPaintings;
import io.github.felix3621.example.potion.ModPotions;
import io.github.felix3621.example.sound.ModSounds;
import io.github.felix3621.example.util.BetterBrewingRecipe;
import io.github.felix3621.example.util.ModItemProperties;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Example.MOD_ID)
public class Example {
    public static final String MOD_ID = "example";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Example() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModPaintings.register(eventBus);
        ModSounds.register(eventBus);

        ModEffects.register(eventBus);
        ModPotions.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_SAPLING.get(), RenderType.cutout());

        ModItemProperties.addCustomItemProperties();
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_ROSE.getId(), ModBlocks.POTTED_PINK_ROSE);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.CITRINE.get(), ModPotions.FREEZE_POTION.get()));
        });
    }
}
