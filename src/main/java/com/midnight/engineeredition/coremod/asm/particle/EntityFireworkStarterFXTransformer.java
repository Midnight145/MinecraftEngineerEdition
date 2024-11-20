package com.midnight.engineeredition.coremod.asm.particle;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityFireworkStarterFXTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.particle.EntityFireworkStarterFX";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("a", "createShaped"), "(D[[D[I[IZZZ)V");
    }
}
