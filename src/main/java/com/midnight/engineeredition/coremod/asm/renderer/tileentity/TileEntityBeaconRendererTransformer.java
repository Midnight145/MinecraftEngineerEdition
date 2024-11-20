package com.midnight.engineeredition.coremod.asm.renderer.tileentity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class TileEntityBeaconRendererTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "renderTileEntityAt"),
            "(L" + this.getCorrectSymbol("aoq;", "net/minecraft/tileentity/TileEntityBeacon;") + "DDDF)V");
    }
}
