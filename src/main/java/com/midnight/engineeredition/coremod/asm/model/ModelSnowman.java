package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.Util;
import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelSnowman implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelSnowman";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return Util.of(
            this.getCorrectSymbol("a", "setRotationAngles"),
            "(FFFFFFL" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + ")V");
    }
}
