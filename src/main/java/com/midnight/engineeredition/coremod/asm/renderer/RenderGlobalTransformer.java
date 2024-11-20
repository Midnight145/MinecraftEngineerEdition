package com.midnight.engineeredition.coremod.asm.renderer;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderGlobalTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.RenderGlobal";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("i", "renderStars"),
            "()V",
            this.getCorrectSymbol("a", "renderSky"),
            "(F)V",
            this.getCorrectSymbol("a", "playAuxSFX"),
            "(L" + this.getCorrectSymbol("yz;", "net/minecraft/entity/player/EntityPlayer;") + "IIIII)V");
    }
}
