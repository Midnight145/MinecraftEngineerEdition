package com.midnight.engineeredition.coremod.asm.item;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ItemTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.item.Item";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "getMovingObjectPositionFromPlayer"),
            "(L" + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "L"
                + this.getCorrectSymbol("yz;", "net/minecraft/entity/player/EntityPlayer;")
                + "Z)L"
                + this.getCorrectSymbol("azu;", "net/minecraft/util/MovingObjectPosition;")
                + "");
    }
}
