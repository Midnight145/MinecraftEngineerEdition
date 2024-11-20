package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderEnchantmentTableTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.entity.RenderEnchantmentTable";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "renderTileEntityAt"),
            "(L" + this.getCorrectSymbol("apd;", "net/minecraft/tileentity/TileEntityEnchantmentTable;") + "DDDF)V");
    }
}
