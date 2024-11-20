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
            this.getCorrectSymbol("a", "renderParticle"),
            "(L" + this.getCorrectSymbol("bmh;", "net/minecraft/client/renderer/Tessellator;") + "FFFFFF)V");
    }
}
