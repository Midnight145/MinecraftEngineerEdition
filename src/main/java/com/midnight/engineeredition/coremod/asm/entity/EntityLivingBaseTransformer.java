package com.midnight.engineeredition.coremod.asm.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityLivingBaseTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.EntityLivingBase";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_70097_a", "attackEntityFrom"),
            "(Lnet/minecraft/util/DamageSource;F)Z",
            this.getCorrectSymbol("func_70669_a", "renderBrokenItemStack"),
            "(Lnet/minecraft/item/ItemStack;)V",
            this.getCorrectSymbol("func_70071_h_", "onUpdate"),
            "()V",
            this.getCorrectSymbol("func_70676_i", "getLook"),
            "(F)Lnet/minecraft/util/Vec3;");
    }
}
