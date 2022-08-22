package createab.register;

import com.simibubi.create.content.curiosities.armor.CopperBacktankInstance;
import com.simibubi.create.content.curiosities.armor.CopperBacktankRenderer;
import com.simibubi.create.content.curiosities.armor.CopperBacktankTileEntity;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;
import createab.CreateArmoredCopperBacktanks;

public class ModTiles {

    //Iron
    public static final BlockEntityEntry<CopperBacktankTileEntity> IRON_REINFORCED_COPPER_BACKTANK = CreateArmoredCopperBacktanks.registrate()
            .tileEntity("iron_reinforced_copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.IRON_REINFORCED_COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();

    //Gold
    public static final BlockEntityEntry<CopperBacktankTileEntity> GOLD_REINFORCED_COPPER_BACKTANK = CreateArmoredCopperBacktanks.registrate()
            .tileEntity("gold_reinforced_copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.GOLD_REINFORCED_COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();

    //Diamond
    public static final BlockEntityEntry<CopperBacktankTileEntity> DIAMOND_REINFORCED_COPPER_BACKTANK = CreateArmoredCopperBacktanks.registrate()
            .tileEntity("diamond_reinforced_copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.DIAMOND_REINFORCED_COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();

    //Netherite
    public static final BlockEntityEntry<CopperBacktankTileEntity> NETHERITE_REINFORCED_COPPER_BACKTANK = CreateArmoredCopperBacktanks.registrate()
            .tileEntity("netherite_reinforced_copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.NETHERITE_REINFORCED_COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();
    public static void register() {}
}
