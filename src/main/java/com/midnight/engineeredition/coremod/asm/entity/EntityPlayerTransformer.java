package com.midnight.engineeredition.coremod.asm.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityPlayerTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.player.EntityPlayer";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("c", "updateItemUse"),
            "(L" + this.getCorrectSymbol("add;", "net/minecraft/item/ItemStack;") + "I)V",
            this.getCorrectSymbol("a", "onDeath"),
            "(L" + this.getCorrectSymbol("ro;", "net/minecraft/util/DamageSource;") + ")V",
            this.getCorrectSymbol("a", "func_146097_a"),
            "(L" + this.getCorrectSymbol("add;", "net/minecraft/item/ItemStack;")
                + "ZZ)L"
                + this.getCorrectSymbol("xk;", "net/minecraft/entity/item/EntityItem;")
                + "",
            this.getCorrectSymbol("r", "attackTargetEntityWithCurrentItem"),
            "(L" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + ")V");
    }
}
