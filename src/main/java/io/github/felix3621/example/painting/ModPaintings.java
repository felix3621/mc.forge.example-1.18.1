package io.github.felix3621.example.painting;

import io.github.felix3621.example.Example;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTINGM_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Example.MOD_ID);

    public static final RegistryObject<Motive> MARATHON =
            PAINTINGM_MOTIVES.register("marathon", () -> new Motive(16, 16));
    public static final RegistryObject<Motive> FAMILY =
            PAINTINGM_MOTIVES.register("family", () -> new Motive(16, 32));

    public static void register(IEventBus eventBus) {
        PAINTINGM_MOTIVES.register(eventBus);
    }
}
