package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class BlockDaylightDetectorTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.block.BlockDaylightDetector";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("e", "func_149957_e"),
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;") + "III)V");
    }
}
