package io.github.felix3621.example.datagen;

import io.github.felix3621.example.Example;
import io.github.felix3621.example.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Example.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CITRINE.get());

        handheldItem(ModItems.CITRINE_AXE.get());
        handheldItem(ModItems.CITRINE_SHOVEL.get());
        handheldItem(ModItems.CITRINE_PICKAXE.get());
        handheldItem(ModItems.CITRINE_SWORD.get());
        handheldItem(ModItems.CITRINE_HOE.get());

        simpleItem(ModItems.COAL_COKE.get());
        simpleItem(ModItems.CUCUMBER.get());
        simpleItem(ModItems.CUCUMBER_SEEDS.get());
        simpleItem(ModItems.HONEY_BUCKET.get());
        simpleItem(ModItems.MAGIC_DUST.get());

        simpleItem(ModItems.CITRINE_HELMET.get());
        simpleItem(ModItems.CITRINE_CHESTPLATE.get());
        simpleItem(ModItems.CITRINE_LEGGING.get());
        simpleItem(ModItems.CITRINE_BOOTS.get());

        simpleItem(ModItems.DATA_TABLET.get());
        simpleItem(ModItems.DOWSING_ROD.get());
        simpleItem(ModItems.EBONY_SIGN.get());
        simpleItem(ModItems.GEM_CUTTER_TOOL.get());
        simpleItem(ModItems.RAW_CITRINE.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Example.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Example.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }
}
