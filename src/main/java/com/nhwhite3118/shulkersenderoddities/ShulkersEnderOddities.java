package com.nhwhite3118.shulkersenderoddities;

import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ShulkersEnderOddities.MODID)
public class ShulkersEnderOddities {

    public static final String MODID = "shulkersenderoddities";
    //public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ShulkersEnderOddities(IEventBus modEventBus, ModContainer modContainer) {
//
//        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        SEOStructures.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);
        SEOStructurePlacements.DEFERRED_REGISTRY_STRUCTURE_PLACEMENT_TYPE.register(modEventBus);
    }
}
