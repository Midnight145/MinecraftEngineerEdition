package com.midnight.engineeredition.coremod.asm.entity.boss;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityDragonTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.boss.EntityDragon";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70636_d", "onLivingUpdate"),
            "()V",
            this.getCorrectSymbol("func_70965_a", "attackEntityFromPart"),
            "(Lnet/minecraft/entity/boss/EntityDragonPart;Lnet/minecraft/util/DamageSource;F)Z");
    }
}
