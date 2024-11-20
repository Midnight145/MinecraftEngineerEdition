package com.midnight.engineeredition.coremod.asm.entity.monster;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityBlazeTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.monster.EntityBlaze";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_70785_a", "attackEntity"), "(Lnet/minecraft/entity/Entity;F)V");
    }
}
