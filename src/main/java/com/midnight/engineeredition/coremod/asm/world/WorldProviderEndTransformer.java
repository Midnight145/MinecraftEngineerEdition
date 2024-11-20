package com.midnight.engineeredition.coremod.asm.world;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class WorldProviderEndTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.WorldProviderEnd";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("b", "getFogColor"),
            "(FF)L" + this.getCorrectSymbol("azw;", "net/minecraft/util/Vec3;") + "");
    }
}
