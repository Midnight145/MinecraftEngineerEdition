package com.midnight.engineeredition.coremod.asm.village;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class VillageSiegeTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.village.VillageSiege";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of("func_75529_b", "()Z");
    }
}
