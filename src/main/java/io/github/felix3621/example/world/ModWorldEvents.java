package io.github.felix3621.example.world;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.entity.ModEntityTypes;
import io.github.felix3621.example.world.gen.ModEntityGeneration;
import io.github.felix3621.example.world.gen.ModFlowerGeneration;
import io.github.felix3621.example.world.gen.ModOreGeneration;
import io.github.felix3621.example.world.gen.ModTreeGeneration;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Example.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);

        ModEntityGeneration.onEntitySpawn(event);
    }
}
