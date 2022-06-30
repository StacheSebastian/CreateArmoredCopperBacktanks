package io.github.stachesebastian.createab.register;

import com.simibubi.create.content.curiosities.armor.CopperBacktankInstance;
import com.simibubi.create.content.curiosities.armor.CopperBacktankRenderer;
import com.simibubi.create.content.curiosities.armor.CopperBacktankTileEntity;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;
import io.github.stachesebastian.createab.CreateArmoredBacktanks;

public class ModTiles {

    public static final BlockEntityEntry<CopperBacktankTileEntity> COPPER_BACKTANK = CreateArmoredBacktanks.registrate()
            .tileEntity("copper_backtank", CopperBacktankTileEntity::new)
            .instance(() -> CopperBacktankInstance::new)
            .validBlocks(ModBlocks.COPPER_BACKTANK)
            .renderer(() -> CopperBacktankRenderer::new)
            .register();
    public static void register() {}
}
