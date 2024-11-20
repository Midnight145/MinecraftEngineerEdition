package com.midnight.engineeredition.coremod.asm.renderer;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityRendererTransformer implements IAsmEditor {

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_78482_e", "hurtCameraEffect"),
            "(F)V",
            this.getCorrectSymbol("func_78475_f", "setupViewBobbing"),
            "(F)V",
            this.getCorrectSymbol("func_78467_g", "orientCamera"),
            "(F)V",
            this.getCorrectSymbol("func_82830_a", "getNightVisionBrightness"),
            "(Lnet/minecraft/entity/player/EntityPlayer;F)F");
    }

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer";
    }
}
