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
            this.getCorrectSymbol("func_71010_c", "updateItemUse"),
            "(Lnet/minecraft/item/ItemStack;I)V",
            this.getCorrectSymbol("func_70645_a", "onDeath"),
            "(Lnet/minecraft/util/DamageSource;)V",
            "func_146097_a",
            "(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;",
            this.getCorrectSymbol("func_71059_n", "attackTargetEntityWithCurrentItem"),
            "(Lnet/minecraft/entity/Entity;)V");
    }
}
