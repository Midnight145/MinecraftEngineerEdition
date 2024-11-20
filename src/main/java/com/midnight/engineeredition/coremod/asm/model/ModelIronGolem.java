package com.midnight.engineeredition.coremod.asm.model;

import java.util.Map;

import com.midnight.engineeredition.coremod.Util;
import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ModelIronGolem implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.model.ModelIronGolem";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return Util
            .of(this.getCorrectSymbol("func_78087_a", "setRotationAngles"), "(FFFFFFLnet/minecraft/entity/Entity;)V");
    }
}
