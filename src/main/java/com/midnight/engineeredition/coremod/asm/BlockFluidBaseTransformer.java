package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class BlockFluidBaseTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraftforge.fluids.BlockFluidBase";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "getFlowDirection"),
            "(L" + this.getCorrectSymbol("ahl;", "net/minecraft/world/IBlockAccess;")
                + "IIIL"
                + this.getCorrectSymbol("awt;", "net/minecraft/block/material/Material;")
                + ")D");
    }
}
