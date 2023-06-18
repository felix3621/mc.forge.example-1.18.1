package io.github.felix3621.example.recipe;

import io.github.felix3621.example.Example;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Example.MOD_ID);

    public static final RegistryObject<RecipeSerializer<GemCuttingStationRecipe>> GEM_CUTTING_SERIALIZER =
            SERIALIZERS.register("gem_cutting", () -> GemCuttingStationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
