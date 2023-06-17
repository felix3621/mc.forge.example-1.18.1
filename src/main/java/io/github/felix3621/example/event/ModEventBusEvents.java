package io.github.felix3621.example.event;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.event.loot.CoalCokeFromCreeperAdditionModifier;
import io.github.felix3621.example.event.loot.CucumberSeedsFromGrassAdditionModifier;
import io.github.felix3621.example.event.loot.DowsingRodInIglooAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Example.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new CucumberSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Example.MOD_ID,"cucumber_seeds_from_grass")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Example.MOD_ID,"dowsing_rod_in_igloo")),
                new CoalCokeFromCreeperAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Example.MOD_ID,"coal_coke_from_creeper"))
        );
    }
}
