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
            this.getCorrectSymbol("func_77659_a", "onItemRightClick"),
            "(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;");
    }
}
