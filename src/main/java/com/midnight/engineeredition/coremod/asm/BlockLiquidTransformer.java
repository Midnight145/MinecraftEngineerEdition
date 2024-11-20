package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class BlockLiquidTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.block.BlockLiquid";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_149802_a", "getFlowDirection"),
            "(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/block/material/Material;)D");
    }
}
