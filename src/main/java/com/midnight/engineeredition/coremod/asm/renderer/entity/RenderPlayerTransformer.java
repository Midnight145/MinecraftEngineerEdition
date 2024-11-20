package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderPlayerTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.entity.RenderPlayer";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "renderEquippedItems"),
            "(L" + this.getCorrectSymbol("blg;", "net/minecraft/client/entity/AbstractClientPlayer;") + "F)V");
    }
}
