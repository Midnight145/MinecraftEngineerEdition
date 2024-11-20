package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelBatTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelBat";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "render"),
            "(L" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + "FFFFFF)V");
    }
}
