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
            this.getCorrectSymbol("func_147500_a", "renderTileEntityAt"),
            "(Lnet/minecraft/tileentity/TileEntityBeacon;DDDF)V");
    }
}
