package com.midnight.engineeredition.coremod.asm.entity.projectile;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityThrowableTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.projectile.EntityThrowable";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("c", "setThrowableHeading"),
            "(DDDFF)V",
            this.getCorrectSymbol("i", "setVelocity"),
            "(DDD)V",
            this.getCorrectSymbol("h", "onUpdate"),
            "()V",
            "<init>",
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "L"
                + this.getCorrectSymbol("sv;", "net/minecraft/entity/EntityLivingBase;")
                + ")V");
    }
}
