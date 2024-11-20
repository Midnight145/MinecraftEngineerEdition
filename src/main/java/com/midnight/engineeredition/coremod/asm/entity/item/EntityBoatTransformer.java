package com.midnight.engineeredition.coremod.asm.entity.item;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityBoatTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.item.EntityBoat";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V",
            this.getCorrectSymbol("func_70043_V", "updateRiderPosition"),
            "()V");
    }
}
