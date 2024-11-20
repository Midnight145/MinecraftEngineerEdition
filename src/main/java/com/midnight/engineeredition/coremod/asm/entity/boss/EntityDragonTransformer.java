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
            this.getCorrectSymbol("e", "onLivingUpdate"),
            "()V",
            this.getCorrectSymbol("a", "attackEntityFromPart"),
            "(L" + this.getCorrectSymbol("wy;", "net/minecraft/entity/boss/EntityDragonPart;")
                + "L"
                + this.getCorrectSymbol("ro;", this.getCorrectSymbol("ro;", "net/minecraft/util/DamageSource;"))
                + "F)Z");
    }
}
