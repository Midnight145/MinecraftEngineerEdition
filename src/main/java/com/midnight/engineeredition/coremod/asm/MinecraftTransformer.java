package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class MinecraftTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.Minecraft";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("a", "displayDebugInfo"), "(J)V");
    }
}
