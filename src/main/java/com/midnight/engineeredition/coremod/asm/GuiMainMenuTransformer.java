package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

public class GuiMainMenuTransformer implements IAsmEditor {

    @Override
    public String getClassName() {
        return "net.minecraft.client.gui.GuiMainMenu";
    }

    @Override
    public Map<String, String> getMethodInfo() {
        return com.midnight.engineeredition.coremod.Util.of(this.getCorrectSymbol("a", "drawScreen"), "(IIF)V");
    }
}
