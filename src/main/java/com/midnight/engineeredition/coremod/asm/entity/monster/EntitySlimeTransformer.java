package com.midnight.engineeredition.coremod.asm.entity.monster;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntitySlimeTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.monster.EntitySlime";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("h", "onUpdate"), "()V");
    }
}
