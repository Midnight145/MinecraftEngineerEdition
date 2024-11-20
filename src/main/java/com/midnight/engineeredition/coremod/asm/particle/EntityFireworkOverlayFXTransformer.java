package com.midnight.engineeredition.coremod.asm.particle;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityFireworkOverlayFXTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.particle.EntityFireworkOverlayFX";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70539_a", "renderParticle"),
            "(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V");
    }
}
