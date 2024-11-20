package com.midnight.engineeredition.coremod.asm.entity.projectile;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityFireballTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.projectile.EntityFireball";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("h", "onUpdate"), "()V");
    }
}
