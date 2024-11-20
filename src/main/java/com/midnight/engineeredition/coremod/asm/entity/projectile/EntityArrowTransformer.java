package com.midnight.engineeredition.coremod.asm.entity.projectile;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityArrowTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.projectile.EntityArrow";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70186_c", "setThrowableHeading"),
            "(DDDFF)V",
            this.getCorrectSymbol("func_70016_h", "setVelocity"),
            "(DDD)V",
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V");
    }
}
