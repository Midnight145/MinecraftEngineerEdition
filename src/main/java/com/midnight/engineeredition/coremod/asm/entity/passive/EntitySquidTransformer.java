package com.midnight.engineeredition.coremod.asm.entity.passive;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntitySquidTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.passive.EntitySquid";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("e", "onLivingUpdate"),
            "()V",
            this.getCorrectSymbol("bq", "updateEntityActionState"),
            "()V");
    }
}
