package io.github.felix3621.example.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ExampleCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> CITRINE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CITRINE_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for ExampleMod");

        CITRINE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        CITRINE_ORE_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
