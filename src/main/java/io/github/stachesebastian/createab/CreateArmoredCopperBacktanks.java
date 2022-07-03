package io.github.stachesebastian.createab;

import StacheSebastian.BuildConfig;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.nullness.NonNullSupplier;
import io.github.stachesebastian.createab.register.*;
import io.github.stachesebastian.createab.register.config.ModConfigs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.data.loading.DatagenModLoader;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BuildConfig.MODID)
public class CreateArmoredCopperBacktanks {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(BuildConfig.MODID);
    public static IEventBus modEventBus;

    public static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(BuildConfig.MODID);

    public static CreativeModeTab createabtab = new CreateArmoredCopperBacktanksTab();

    public static CreateRegistrate registrate() {
        return (CreateRegistrate)REGISTRATE.get();
    }

    public CreateArmoredCopperBacktanks() {
        ModItems.register();
        ModBlocks.register();
        ModEntities.register();
        ModTiles.register();
        modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        if (DatagenModLoader.isRunningDataGen()) {
            modEventBus.addListener((GatherDataEvent g) -> ModPonder.generateLang(REGISTRATE.get(), g));
        }
        modEventBus.addListener((FMLClientSetupEvent e) -> ModPonder.register());
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,
                () -> ModPartials::load);
        modEventBus.addListener(ModConfigs::onLoad);
        modEventBus.addListener(ModConfigs::onReload);
        ModConfigs.register();
    }
}
