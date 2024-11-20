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
            this.getCorrectSymbol("a", "renderBlockBrewingStand"),
            "(L" + this.getCorrectSymbol("ajq;", "net/minecraft/block/BlockBrewingStand;") + "III)Z",
            this.getCorrectSymbol("e", "renderBlockLever"),
            "(L" + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;") + "III)Z",
            this.getCorrectSymbol("f", "renderBlockTripWireSource"),
            "(L" + this.getCorrectSymbol("aji;", "net/minecraft/block/Block;") + "III)Z",
            this.getCorrectSymbol("a", "renderBlockDoublePlant"),
            "(L" + this.getCorrectSymbol("ako;", "net/minecraft/block/BlockDoublePlant;") + "III)Z");
    }
}
