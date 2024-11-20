package com.midnight.engineeredition.coremod.asm.entity.passive;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityWolfTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.passive.EntityWolf";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("h", "onUpdate"),
            "()V",
            this.getCorrectSymbol("g", "getShakeAngle"),
            "(FF)F",
            this.getCorrectSymbol("q", "getInterestedAngle"),
            "(F)F",
            this.getCorrectSymbol("ch", "getTailRotation"),
            "()F");
    }
}
