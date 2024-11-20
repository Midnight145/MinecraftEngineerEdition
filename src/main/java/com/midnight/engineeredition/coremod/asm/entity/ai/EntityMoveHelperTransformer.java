package com.midnight.engineeredition.coremod.asm.entity.ai;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EntityMoveHelperTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.entity.ai.EntityMoveHelper";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util
            .of(this.getCorrectSymbol("func_75641_c", "onUpdateMoveHelper"), "()V");
    }
}