package com.midnight.engineeredition.coremod.asm.entity.projectile;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityFishHookTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.projectile.EntityFishHook";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("h", "onUpdate"),
            "()V",
            this.getCorrectSymbol("c", "func_146035_c"), // handleHookCasting ?
            "(DDDFF)V",
            "<init>",
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "L"
                + this.getCorrectSymbol("yz;", "net/minecraft/entity/player/EntityPlayer;")
                + ")V");
    }
}
