package com.midnight.engineeredition.coremod.asm.world;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class WorldTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.World";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            "getSunBrightnessFactor",
            "(F)F",
            "getSunBrightnessBody",
            "(F)F",
            "getSkyColorBody",
            "(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/util/Vec3",
            this.getCorrectSymbol("func_72929_e", "getCelestialAngleRadians"),
            "(F)F",
            "drawCloudsBody",
            "(F)Lnet/minecraft/util/Vec3",
            "getStarBrightnessBody",
            "(F)F"

        );
    }
}
