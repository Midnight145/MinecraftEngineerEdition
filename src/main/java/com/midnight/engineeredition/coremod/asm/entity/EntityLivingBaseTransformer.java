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
            this.getCorrectSymbol("a", "attackEntityFrom"),
            "(L" + this.getCorrectSymbol("ro;", "net/minecraft/util/DamageSource;") + "F)Z",
            this.getCorrectSymbol("a", "renderBrokenItemStack"),
            "(L" + this.getCorrectSymbol("add;", "net/minecraft/item/ItemStack;") + ")V",
            this.getCorrectSymbol("h", "onUpdate"),
            "()V",
            this.getCorrectSymbol("j", "getLook"),
            "(F)L" + this.getCorrectSymbol("azw;", "net/minecraft/util/Vec3;") + "");
    }
}
