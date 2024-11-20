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
            this.getCorrectSymbol("func_77621_a", "getMovingObjectPositionFromPlayer"),
            "(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Z)Lnet/minecraft/util/MovingObjectPosition;");
    }
}
