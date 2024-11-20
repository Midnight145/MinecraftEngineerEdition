package com.midnight.engineeredition.coremod.asm.entity.passive;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityAnimalTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.passive.EntityAnimal";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "attackEntity"),
            "(L" + this.getCorrectSymbol("sa;", "net/minecraft/entity/Entity;") + "F)V");
    }
}
