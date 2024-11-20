package com.midnight.engineeredition.coremod.asm.world.gen;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ChunkProviderHellTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.ChunkProviderHell";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("a", "initializeNoiseField"), "([DIIIIII)[D");
    }
}
