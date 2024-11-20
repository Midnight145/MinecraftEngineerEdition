package com.midnight.engineeredition.coremod.asm.entity.boss;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityWitherTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.boss.EntityWither";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70636_d", "onLivingUpdate"),
            "()V",
            "func_82214_u",
            "(I)D",
            "func_82213_w",
            "(I)D");
    }
}
