package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.Util;
import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderDragonTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.client.renderer.entity.RenderDragon";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return Util
            .of(this.getCorrectSymbol("func_76986_a", "doRender"), "(Lnet/minecraft/entity/boss/EntityDragon;DDDFF)V");
    }
}
