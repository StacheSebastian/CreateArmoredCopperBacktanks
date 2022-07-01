package io.github.stachesebastian.createab.register;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import io.github.stachesebastian.createab.CreateArmoredCopperBacktanks;
import io.github.stachesebastian.createab.register.backtanks.iron.IronArmorItem;
import io.github.stachesebastian.createab.register.backtanks.iron.IronReinforcedCopperBacktankItem;

public class ModItems {

    private static final CreateRegistrate REGISTRATE = CreateArmoredCopperBacktanks.registrate()
            .creativeModeTab(() -> CreateArmoredCopperBacktanks.createabtab);


    public static final ItemEntry<IronReinforcedCopperBacktankItem.IronReinforcedCopperBacktankBlockItem> IRON_REINFORCED_COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("iron_reinforced_copper_backtank_placeable", p -> new IronReinforcedCopperBacktankItem.IronReinforcedCopperBacktankBlockItem(ModBlocks.IRON_REINFORCED_COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();

    public static final ItemEntry<? extends IronArmorItem> IRON_REINFORCED_COPPER_BACKTANK = REGISTRATE
            .item("iron_reinforced_copper_backtank", p -> new IronReinforcedCopperBacktankItem(p, IRON_REINFORCED_COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    public static void register() {}

}
