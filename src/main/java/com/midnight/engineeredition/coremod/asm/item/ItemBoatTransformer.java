package com.midnight.engineeredition.coremod.asm.item;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class ItemBoatTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.item.ItemBoat";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "onItemRightClick"),
            "(L" + this.getCorrectSymbol("add;", "net/minecraft/item/ItemStack;")
                + "L"
                + this.getCorrectSymbol("ahb;", "net/minecraft/world/World;")
                + "L"
                + this.getCorrectSymbol("yz;", "net/minecraft/entity/player/EntityPlayer;")
                + ")L"
                + this.getCorrectSymbol("add;", "net/minecraft/item/ItemStack;")
                + "");
    }
}
