package com.midnight.engineeredition.coremod.asm.renderer.tileentity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class TileEntityEnderChestRenderer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "renderTileEntityAt"),
            "(L" + this.getCorrectSymbol("ape;", "net/minecraft/tileentity/TileEntityEnderChest;") + "DDDF)V");
    }
}
