package com.midnight.engineeredition;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class EngineerEditionCore extends DummyModContainer implements IFMLLoadingPlugin {

    public static double PI;

    public static String MODID = "engineeredition";

    public static Logger logger = LogManager.getLogger(EngineerEditionCore.MODID);

    private static final ModMetadata modMetadata = new ModMetadata();
    private static boolean isEnabled;

    static {
        modMetadata.modId = MODID;
        modMetadata.name = MODID;
        modMetadata.version = "0.0.4";
    }

    @SuppressWarnings("unused")
    public EngineerEditionCore() {
        this(modMetadata);
        String path = Paths.get("config", EngineerEditionCore.MODID + ".cfg")
            .toString();
        Configuration configuration = new Configuration(new File(path));
        isEnabled = configuration.getBoolean("isEnabled", "main", true, "Global toggle for the mod");
        PI = configuration.getFloat(
            "PI",
            "main",
            3.0f,
            -Float.MAX_VALUE,
            Float.MAX_VALUE,
            "If <= 0 and allowBreakingValues is off, will default to Math.PI");
        boolean allowBreakingValues = configuration.getBoolean(
            "allowBreakingValues",
            "main",
            false,
            "Allows for PI <= 0. This will likely just hang at the main menu.");
        if (!allowBreakingValues && PI <= 0f) {
            isEnabled = false;
        }
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public EngineerEditionCore(ModMetadata md) {
        super(md);
    }

    @Override
    public String[] getASMTransformerClass() {
        return isEnabled ? new String[] { "com.midnight.engineeredition.EngineerEditionClassTransformer" } : null;
    }

    @Override
    public String getModContainerClass() {
        return "com.midnight.engineeredition.EngineerEditionCore";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
