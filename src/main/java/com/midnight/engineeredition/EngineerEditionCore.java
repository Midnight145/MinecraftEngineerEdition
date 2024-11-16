package com.midnight.engineeredition;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraftforge.common.config.Configuration;

import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class EngineerEditionCore implements IEarlyMixinLoader, IFMLLoadingPlugin {

    public static int PI;

    public EngineerEditionCore() {
        super();
        String path = Paths.get("config", EngineerEdition.MODID + ".cfg")
            .toString();
        Configuration configuration = new Configuration(new File(path));
        PI = configuration.getInt("PI", "main", 3, -Integer.MAX_VALUE, Integer.MAX_VALUE, "");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    @Override
    public String getMixinConfig() {
        return "mixins." + EngineerEdition.MODID + ".early.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoremods) {
        List<String> mixins = new ArrayList<>();
        mixins.add("MixinMathHelper");
        return mixins;
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
