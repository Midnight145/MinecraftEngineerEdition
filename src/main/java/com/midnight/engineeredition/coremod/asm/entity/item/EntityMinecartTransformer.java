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
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V",
            "func_145821_a",
            "(IIIDDLnet/minecraft/block/Block;I)V",
            this.getCorrectSymbol("func_70108_f", "applyEntityCollision"),
            "(Lnet/minecraft/entity/Entity;)V");
    }
}
