package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RendererLivingEntityTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.entity.RenderLivingEntity";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("e", "renderArrowsStuckInEntity"),
            "(L" + this.getCorrectSymbol("sv;", "net/minecraft/entity/EntityLivingBase;") + "F)V");
    }
}
