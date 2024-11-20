package com.midnight.engineeredition.coremod.asm.world;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class WorldProviderTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.WorldProvider";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_76560_a", "calcSunriseSunsetColors"),
            "(FF)[F",
            this.getCorrectSymbol("func_76563_a", "calculateCelestialAngle"),
            "(JF)F",
            this.getCorrectSymbol("func_76562_b", "getFogColor"),
            "(FF)Lnet/minecraft/util/Vec3;");
    }
}
