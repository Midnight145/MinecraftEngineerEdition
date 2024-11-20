package com.midnight.engineeredition.coremod.asm.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityLivingTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.EntityLiving";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "faceEntity"),
            "(L" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + "FF)V");
    }
}
