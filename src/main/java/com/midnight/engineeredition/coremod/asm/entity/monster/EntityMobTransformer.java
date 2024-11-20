package com.midnight.engineeredition.coremod.asm.entity.monster;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityMobTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.monster.EntityMob";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_70652_k", "attackEntityAsMob"), "(Lnet/minecraft/entity/Entity;)Z");
    }
}
