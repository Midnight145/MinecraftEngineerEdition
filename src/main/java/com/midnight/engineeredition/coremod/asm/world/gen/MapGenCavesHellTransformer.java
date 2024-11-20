package com.midnight.engineeredition.coremod.asm.world.gen;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class MapGenCavesHellTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.MapGenCavesHell";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            "func_151543_a",
            "(JII[Lnet/minecraft/block/Block;DDDFFFIID)V",
            "func_151538_a",
            "(Lnet/minecraft/world/World;IIII[Lnet/minecraft/block/Block;)V");
    }
}
