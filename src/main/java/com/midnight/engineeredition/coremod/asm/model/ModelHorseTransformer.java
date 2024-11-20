package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelHorseTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelHorse";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_78086_a", "setLivingAnimations"),
            "(Lnet/minecraft/entity/EntityLivingBase;FFF)V");
    }
}
