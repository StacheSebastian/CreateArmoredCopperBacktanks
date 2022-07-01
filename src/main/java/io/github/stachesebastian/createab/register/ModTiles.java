package io.github.stachesebastian.createab.register;

import com.simibubi.create.content.curiosities.armor.CopperBacktankInstance;
import com.simibubi.create.content.curiosities.armor.CopperBacktankRenderer;
import com.simibubi.create.content.curiosities.armor.CopperBacktankTileEntity;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;
import io.github.stachesebastian.createab.CreateArmoredCopperBacktanks;

public class ModTiles {

    public static final BlockEntityEntry<CopperBacktankTileEntity> IRON_REINFORCED_COPPER_BACKTANK = CreateArmoredCopperBacktanks.registrate()
            .tileEntity("iron_reinforced_copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.IRON_REINFORCED_COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();
    public static void register() {}
}
