package com.midnight.engineeredition.coremod.asm.world.gen.structure;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class MapGenStrongholdTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.world.gen.structure.MapGenStronghold";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_75047_a", "canSpawnStructureAtCoords"), "(II)Z");
    }
}
