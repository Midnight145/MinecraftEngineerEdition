package com.midnight.engineeredition.coremod.asm.renderer;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderBlocksTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.RenderBlocks";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("func_147741_a", "renderBlockBrewingStand"),
            "(Lnet/minecraft/block/BlockBrewingStand;III)Z",
            this.getCorrectSymbol("func_147790_e", "renderBlockLever"),
            "(Lnet/minecraft/block/Block;III)Z",
            this.getCorrectSymbol("func_147723_f", "renderBlockTripWireSource"),
            "(Lnet/minecraft/block/Block;III)Z",
            this.getCorrectSymbol("func_147774_a", "renderBlockDoublePlant"),
            "(Lnet/minecraft/block/BlockDoublePlant;III)Z");
    }
}
