package com.midnight.engineeredition.coremod.asm.renderer.entity;

import java.util.Map;

import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class RenderItemTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.renderer.entity.RenderItem";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(
            this.getCorrectSymbol("a", "doRender"),
            "(L" + this.getCorrectSymbol("xk;", "net/minecraft/entity/item/EntityItem;") + "DDDFF)V",
            this.getCorrectSymbol("a", "renderDroppedItem"),
            "(L" + this.getCorrectSymbol("xk;", "net/minecraft/entity/item/EntityItem;")
                + "L"
                + this.getCorrectSymbol("rf;", "net/minecraft/util/IIcon;")
                + "IFFFF)V");
    }
}
