package com.midnight.engineeredition.coremod.asm.world.gen;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class MapGenRavineTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.MapGenRavine";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "func_151540_a"),
            "(JII[L" + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;") + "DDDFFFIID)V",
            this.getCorrectSymbol("a", "func_151538_a"),
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "IIII[L"
                + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;")
                + ")V");
    }
}
