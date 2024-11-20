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
            this.getCorrectSymbol("func_72730_g", "renderStars"),
            "()V",
            this.getCorrectSymbol("func_72714_a", "renderSky"),
            "(F)V",
            this.getCorrectSymbol("func_72706_a", "playAuxSFX"),
            "(Lnet/minecraft/entity/player/EntityPlayer;IIIII)V");
    }
}
