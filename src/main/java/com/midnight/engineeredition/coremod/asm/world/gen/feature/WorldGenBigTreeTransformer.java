package com.midnight.engineeredition.coremod.asm.world.gen.feature;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class WorldGenBigTreeTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.feature.WorldGenBigTree";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("a", "generateLeafNodeList"), "()V");
    }
}
