package com.midnight.engineeredition.coremod.asm.entity.passive;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityHorseTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.passive.EntityHorse";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("ac", "updateRiderPosition"),
            "()V",
            this.getCorrectSymbol("e", "moveEntityWithHeading"),
            "(FF)V");
    }
}
