package com.midnight.engineeredition.coremod.asm.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.Entity";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_70060_a", "moveFlying"), "(FFF)V");
    }
}
