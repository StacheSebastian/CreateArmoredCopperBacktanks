package io.github.stachesebastian.createab.register;

import com.simibubi.create.content.curiosities.armor.CopperArmorItem;
import com.simibubi.create.content.curiosities.armor.CopperBacktankItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import io.github.stachesebastian.createab.CreateArmoredCopperBacktanks;

public class ModItems {

    private static final CreateRegistrate REGISTRATE = CreateArmoredCopperBacktanks.registrate()
            .creativeModeTab(() -> CreateArmoredCopperBacktanks.createabtab);


    public static final ItemEntry<CopperBacktankItem.CopperBacktankBlockItem> COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("copper_backtank_placeable", p -> new CopperBacktankItem.CopperBacktankBlockItem(ModBlocks.COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();

    public static final ItemEntry<? extends CopperArmorItem> COPPER_BACKTANK = REGISTRATE
            .item("copper_backtank", p -> new CopperBacktankItem(p, COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    public static void register() {}

}
