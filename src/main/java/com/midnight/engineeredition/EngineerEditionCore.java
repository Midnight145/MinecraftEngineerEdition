package com.midnight.engineeredition;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;
import com.midnight.engineeredition.coremod.asm.BlockDaylightDetectorTransformer;
import com.midnight.engineeredition.coremod.asm.BlockFluidBaseTransformer;
import com.midnight.engineeredition.coremod.asm.BlockLiquidTransformer;
import com.midnight.engineeredition.coremod.asm.GuiMainMenuTransformer;
import com.midnight.engineeredition.coremod.asm.IAsmEditor;
import com.midnight.engineeredition.coremod.asm.MinecraftTransformer;
import com.midnight.engineeredition.coremod.asm.entity.EntityCreatureTransformer;
import com.midnight.engineeredition.coremod.asm.entity.EntityLivingBaseTransformer;
import com.midnight.engineeredition.coremod.asm.entity.EntityLivingTransformer;
import com.midnight.engineeredition.coremod.asm.entity.EntityPlayerTransformer;
import com.midnight.engineeredition.coremod.asm.entity.EntityTransformer;
import com.midnight.engineeredition.coremod.asm.entity.ai.EntityAIControlledByPlayerTransformer;
import com.midnight.engineeredition.coremod.asm.entity.ai.EntityLookHelperTransformer;
import com.midnight.engineeredition.coremod.asm.entity.ai.EntityLookIdleTransformer;
import com.midnight.engineeredition.coremod.asm.entity.ai.EntityMoveHelperTransformer;
import com.midnight.engineeredition.coremod.asm.entity.boss.EntityDragonTransformer;
import com.midnight.engineeredition.coremod.asm.entity.boss.EntityWitherTransformer;
import com.midnight.engineeredition.coremod.asm.entity.item.EntityBoatTransformer;
import com.midnight.engineeredition.coremod.asm.entity.item.EntityEnderEyeTransformer;
import com.midnight.engineeredition.coremod.asm.entity.item.EntityFireworkRocketTransformer;
import com.midnight.engineeredition.coremod.asm.entity.item.EntityMinecartTransformer;
import com.midnight.engineeredition.coremod.asm.entity.monster.EntityBlazeTransformer;
import com.midnight.engineeredition.coremod.asm.entity.monster.EntityGhastTransformer;
import com.midnight.engineeredition.coremod.asm.entity.monster.EntityMobTransformer;
import com.midnight.engineeredition.coremod.asm.entity.monster.EntitySlimeTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntityAnimalTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntityBatTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntityChickenTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntityHorseTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntitySheepTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntitySquidTransformer;
import com.midnight.engineeredition.coremod.asm.entity.passive.EntityWolfTransformer;
import com.midnight.engineeredition.coremod.asm.entity.projectile.EntityArrowTransformer;
import com.midnight.engineeredition.coremod.asm.entity.projectile.EntityFireballTransformer;
import com.midnight.engineeredition.coremod.asm.entity.projectile.EntityFishHookTransformer;
import com.midnight.engineeredition.coremod.asm.entity.projectile.EntityThrowableTransformer;
import com.midnight.engineeredition.coremod.asm.item.ItemBoatTransformer;
import com.midnight.engineeredition.coremod.asm.item.ItemTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelBatTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelBipedTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelBlazeTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelBookTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelChickenTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelCreeperTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelDragonTransformer;
import com.midnight.engineeredition.coremod.asm.model.ModelHorseTransformer;
import com.midnight.engineeredition.coremod.asm.particle.EntityFireworkOverlayFXTransformer;
import com.midnight.engineeredition.coremod.asm.particle.EntityFireworkStarterFXTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.ActiveRendererInfoTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.EntityRendererTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.ItemRendererTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.RenderBlocksTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.RenderGlobalTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderDragonTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderEnchantmentTableTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderFishTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderIronGolemTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderItemTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderLivingTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderMinecartTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderPlayerTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RenderZombieTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.entity.RendererLivingEntityTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.texture.TextureCompassTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.tileentity.TileEntityBeaconRendererTransformer;
import com.midnight.engineeredition.coremod.asm.renderer.tileentity.TileEntityChestRendererTransformer;
import com.midnight.engineeredition.coremod.asm.tileentity.TileEntityEnchantmentTableTransformer;
import com.midnight.engineeredition.coremod.asm.village.VillageSiegeTransformer;
import com.midnight.engineeredition.coremod.asm.world.WorldProviderEndTransformer;
import com.midnight.engineeredition.coremod.asm.world.WorldProviderTransformer;
import com.midnight.engineeredition.coremod.asm.world.WorldTransformer;
import com.midnight.engineeredition.coremod.asm.world.biome.BiomeGenMesaTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.ChunkProviderHellTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.MapGenCavesHellTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.MapGenCavesTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.MapGenRavineTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.feature.WorldGenBigTreeTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.feature.WorldGenMegaJungleTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.feature.WorldGenMinableTransformer;
import com.midnight.engineeredition.coremod.asm.world.gen.structure.MapGenStrongholdTransformer;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class EngineerEditionCore extends DummyModContainer implements IEarlyMixinLoader, IFMLLoadingPlugin {

    public static double PI;

    public static String MODID = "engineeredition";

    public static List<IAsmEditor> editors = new ArrayList<>();
    public static boolean isObfuscated = false;

    public static Logger logger = LogManager.getLogger(EngineerEditionCore.MODID);

    private static final ModMetadata modMetadata = new ModMetadata();
    public static boolean crashOnFail = false;

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
        crashOnFail = configuration.getBoolean("crashOnFail", "main", false, "");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public EngineerEditionCore(ModMetadata md) {
        super(md);
    }

    @Override
    public String getMixinConfig() {
        return "mixins." + EngineerEditionCore.MODID + ".early.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoremods) {
        List<String> mixins = new ArrayList<>();
        mixins.add("MixinMathHelper");
        // mixins.add("MixinEntityArrow");
        // mixins.add("MixinEntityFishHook");
        mixins.add("MixinEntityItem");
        mixins.add("MixinEntityLivingBase");
        mixins.add("MixinEntityNoteFX");
        // mixins.add("MixinEntityThrowable");
        mixins.add("MixinEntityTNTPrimed");
        mixins.add("MixinModelBoat");
        mixins.add("MixinModelBook");
        mixins.add("MixinModelHorse");
        mixins.add("MixinModelMinecart");
        mixins.add("MixinModelSquid");

        return mixins;
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { "com.midnight.engineeredition.coremod.EngineerEditionClassTransformer" };
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
    public void injectData(Map<String, Object> data) {
        isObfuscated = (Boolean) data.get("runtimeDeobfuscationEnabled");
        editors.add(new VillageSiegeTransformer());
        editors.add(new MinecraftTransformer());
        editors.add(new EntityFireworkOverlayFXTransformer());
        editors.add(new EntityFireworkStarterFXTransformer());
        editors.add(new TextureCompassTransformer());
        editors.add(new ActiveRendererInfoTransformer());
        editors.add(new RenderBlocksTransformer());
        editors.add(new EntityRendererTransformer());
        editors.add(new RenderGlobalTransformer());
        editors.add(new RenderLivingTransformer());
        editors.add(new RendererLivingEntityTransformer());
        editors.add(new RenderDragonTransformer());
        editors.add(new RenderMinecartTransformer());
        editors.add(new RenderZombieTransformer());
        editors.add(new RenderFishTransformer());
        editors.add(new RenderPlayerTransformer());
        editors.add(new RenderItemTransformer());
        editors.add(new RenderEnchantmentTableTransformer());
        editors.add(new RenderIronGolemTransformer());
        editors.add(new TileEntityChestRendererTransformer());
        editors.add(new TileEntityBeaconRendererTransformer());
        editors.add(new ItemRendererTransformer());
        editors.add(new GuiMainMenuTransformer());
        editors.add(new WorldProviderEndTransformer());
        editors.add(new WorldTransformer());
        editors.add(new WorldProviderTransformer());
        editors.add(new BiomeGenMesaTransformer());
        editors.add(new WorldGenBigTreeTransformer());
        editors.add(new WorldGenMinableTransformer());
        editors.add(new WorldGenMegaJungleTransformer());
        editors.add(new MapGenRavineTransformer());
        editors.add(new MapGenCavesTransformer());
        editors.add(new MapGenCavesHellTransformer());
        editors.add(new MapGenStrongholdTransformer());
        editors.add(new ChunkProviderHellTransformer());
        editors.add(new BlockFluidBaseTransformer());
        editors.add(new BlockDaylightDetectorTransformer());
        editors.add(new BlockLiquidTransformer());
        editors.add(new ModelCreeperTransformer());
        editors.add(new ModelBipedTransformer());
        editors.add(new ModelChickenTransformer());
        editors.add(new ModelDragonTransformer());
        editors.add(new ModelBatTransformer());
        editors.add(new ModelBlazeTransformer());
        editors.add(new ModelHorseTransformer());
        editors.add(new ModelBookTransformer());
        editors.add(new EntityTransformer());
        editors.add(new EntityAIControlledByPlayerTransformer());
        editors.add(new EntityLookHelperTransformer());
        editors.add(new EntityMoveHelperTransformer());
        editors.add(new EntityLookIdleTransformer());
        editors.add(new EntityHorseTransformer());
        editors.add(new EntityAnimalTransformer());
        editors.add(new EntityBatTransformer());
        editors.add(new EntityChickenTransformer());
        editors.add(new EntityWolfTransformer());
        editors.add(new EntitySheepTransformer());
        editors.add(new EntitySquidTransformer());
        editors.add(new EntityLivingBaseTransformer());
        editors.add(new EntityCreatureTransformer());
        editors.add(new EntityDragonTransformer());
        editors.add(new EntityWitherTransformer());
        editors.add(new EntityFishHookTransformer());
        editors.add(new EntityArrowTransformer());
        editors.add(new EntityFireballTransformer());
        editors.add(new EntityThrowableTransformer());
        editors.add(new EntityGhastTransformer());
        editors.add(new EntityMobTransformer());
        editors.add(new EntityBlazeTransformer());
        editors.add(new EntitySlimeTransformer());
        editors.add(new EntityLivingTransformer());
        editors.add(new EntityBoatTransformer());
        editors.add(new EntityFireworkRocketTransformer());
        editors.add(new EntityMinecartTransformer());
        editors.add(new EntityEnderEyeTransformer());
        editors.add(new EntityPlayerTransformer());
        editors.add(new TileEntityEnchantmentTableTransformer());
        editors.add(new ItemTransformer());
        editors.add(new ItemBoatTransformer());

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
