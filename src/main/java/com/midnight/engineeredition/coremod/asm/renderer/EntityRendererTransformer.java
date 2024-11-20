package com.midnight.engineeredition.coremod.asm.renderer;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityRendererTransformer implements IAsmEditor {

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("f", "hurtCameraEffect"),
            "(F)V",
            this.getCorrectSymbol("g", "setupViewBobbing"),
            "(F)V",
            this.getCorrectSymbol("h", "orientCamera"),
            "(F)V",
            this.getCorrectSymbol("a", "getNightVisionBrightness"),
            "(L" + this.getCorrectSymbol("yz;", "net/minecraft/entity/player/EntityPlayer;") + "F)F");
    }

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer";
    }
}
