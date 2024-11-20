package com.midnight.engineeredition.coremod.asm.entity.projectile;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityFishHookTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.projectile.EntityFishHook";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V",
            "func_146035_c", // handleHookCasting ?
            "(DDDFF)V");
    }
}
