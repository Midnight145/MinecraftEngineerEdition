package com.midnight.engineeredition.coremod.asm.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityCreatureTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.EntityCreature";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("bq", "updateEntityActionState"), "()V");
    }
}
