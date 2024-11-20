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
                + "L"
                + this.getCorrectSymbol("sv;", "net/minecraft/entity/EntityLivingBase;")
                + "FF)V",
            "<init>",
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "L"
                + this.getCorrectSymbol("sv;", "net/minecraft/entity/EntityLivingBase;")
                + "F)V");
    }
}
