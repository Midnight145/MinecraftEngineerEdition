package com.midnight.engineeredition.coremod.asm.world.gen.feature;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class WorldGenMegaJungleTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.feature.WorldGenMegaJungle";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_76484_a", "generate"),
            "(Lnet/minecraft/world/World;Ljava/util/Random;III)Z");
    }
}
