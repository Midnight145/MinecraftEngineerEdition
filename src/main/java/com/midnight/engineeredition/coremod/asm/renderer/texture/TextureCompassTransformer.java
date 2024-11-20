package com.midnight.engineeredition.coremod.asm.renderer.texture;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class TextureCompassTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.texture.TextureCompass";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "updateCompass"),
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;") + "DDDZZ)V");
    }
}
