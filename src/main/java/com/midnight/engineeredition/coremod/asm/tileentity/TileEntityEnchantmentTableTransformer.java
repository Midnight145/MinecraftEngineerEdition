package com.midnight.engineeredition.coremod.asm.tileentity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class TileEntityEnchantmentTableTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.tileentity.TileEntityEnchantmentTable";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("h", "updateEntity"), "()V");
    }
}
