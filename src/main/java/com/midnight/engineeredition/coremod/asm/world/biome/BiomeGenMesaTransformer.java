package com.midnight.engineeredition.coremod.asm.world.biome;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class BiomeGenMesaTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.biome.BiomeGenMesa";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "genTerrainBlocks"),
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "Ljava/util/Random;[L"
                + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;")
                + "[BIID)V");
    }
}
