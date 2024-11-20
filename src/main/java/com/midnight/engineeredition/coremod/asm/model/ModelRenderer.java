package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelRenderer implements IAsmEditor {

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_78088_a", "render"),
            "(Lnet/minecraft/entity/Entity;FFFFFF)V",
            this.getCorrectSymbol("func_78791_b", "renderWithRotation"),
            "(F)V",
            this.getCorrectSymbol("func_78794_c", "postRender"),
            "(F)V");
    }

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelRenderer";
    }
}
