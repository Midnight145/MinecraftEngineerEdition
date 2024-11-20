package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class BlockDaylightDetectorTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.block.BlockDaylightDetector";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of("func_149957_e", "(Lnet/minecraft/world/World;III)V");
    }
}
