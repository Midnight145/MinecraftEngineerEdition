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
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V",
            this.getCorrectSymbol("func_70923_f", "getShakeAngle"),
            "(FF)F",
            this.getCorrectSymbol("func_70917_k", "getInterestedAngle"),
            "(F)F",
            this.getCorrectSymbol("func_70920_v", "getTailRotation"),
            "()F");
    }
}
