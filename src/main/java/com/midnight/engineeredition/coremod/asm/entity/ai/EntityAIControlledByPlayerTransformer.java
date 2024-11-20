package com.midnight.engineeredition.coremod.asm.entity.ai;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityAIControlledByPlayerTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.ai.EntityAIControlledByPlayer";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("e", "updateTask"), "()V");
    }
}
