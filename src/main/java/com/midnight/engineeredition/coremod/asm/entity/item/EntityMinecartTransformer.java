package com.midnight.engineeredition.coremod.asm.entity.item;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityMinecartTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.item.EntityMinecart";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("h", "onUpdate"),
            "()V",
            this.getCorrectSymbol("a", "func_145821_a"),
            "(IIIDDL" + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;") + "I)V",
            this.getCorrectSymbol("g", "applyEntityCollision"),
            "(L" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + ")V");
    }
}
