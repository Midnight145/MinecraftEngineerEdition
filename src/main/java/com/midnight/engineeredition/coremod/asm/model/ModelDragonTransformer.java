package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelDragonTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelDragon";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_78088_a", "render"), "(Lnet/minecraft/entity/Entity;FFFFFF)V");
    }
}
