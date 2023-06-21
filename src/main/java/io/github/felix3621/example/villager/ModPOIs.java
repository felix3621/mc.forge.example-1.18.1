package io.github.felix3621.example.villager;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, Example.MOD_ID);

    public static final RegistryObject<PoiType> FELIX_PORTAL =
            POI.register("felix_portal", () -> new PoiType("felix_portal",
                    PoiType.getBlockStates(ModBlocks.FELIX_PORTAL.get()), 0, 1));

    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
