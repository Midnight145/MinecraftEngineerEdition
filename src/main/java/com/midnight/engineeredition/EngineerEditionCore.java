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

    static {
        modMetadata.modId = MODID;
        modMetadata.name = MODID;
        modMetadata.version = "0.0.2";
    }

    public EngineerEditionCore() {
        this(modMetadata);
        String path = Paths.get("config", EngineerEditionCore.MODID + ".cfg")
            .toString();
        Configuration configuration = new Configuration(new File(path));
        PI = configuration.getFloat("PI", "main", 3.0f, -Float.MAX_VALUE, Float.MAX_VALUE, "");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public EngineerEditionCore(ModMetadata md) {
        super(md);
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { "com.midnight.engineeredition.EngineerEditionClassTransformer" };
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
