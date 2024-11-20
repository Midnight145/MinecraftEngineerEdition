package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderZombieTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.entity.RenderZombie";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_77043_a", "rotateCorpse"),
            "(Lnet/minecraft/entity/monster/EntityZombie;FFF)V");
    }
}