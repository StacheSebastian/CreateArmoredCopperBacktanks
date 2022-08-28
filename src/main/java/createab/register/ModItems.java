package createab.register;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import createab.register.backtanks.gold.GoldArmorItem;
import createab.register.backtanks.gold.GoldReinforcedCopperBacktankItem;
import createab.register.backtanks.iron.IronArmorItem;
import createab.register.backtanks.iron.IronReinforcedCopperBacktankItem;
import createab.CreateArmoredCopperBacktanks;
import createab.register.backtanks.diamond.DiamondArmorItem;
import createab.register.backtanks.diamond.DiamondReinforcedCopperBacktankItem;
import createab.register.backtanks.netherite.NetheriteArmorItem;
import createab.register.backtanks.netherite.NetheriteReinforcedCopperBacktankItem;

public class ModItems {

    private static final CreateRegistrate REGISTRATE = CreateArmoredCopperBacktanks.registrate()
            .creativeModeTab(() -> CreateArmoredCopperBacktanks.createabtab);


    //Iron
    public static final ItemEntry<IronReinforcedCopperBacktankItem.IronReinforcedCopperBacktankBlockItem> IRON_REINFORCED_COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("iron_reinforced_copper_backtank_placeable", p -> new IronReinforcedCopperBacktankItem.IronReinforcedCopperBacktankBlockItem(ModBlocks.IRON_REINFORCED_COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();
    public static final ItemEntry<? extends IronArmorItem> IRON_REINFORCED_COPPER_BACKTANK = REGISTRATE
            .item("iron_reinforced_copper_backtank", p -> new IronReinforcedCopperBacktankItem(p, IRON_REINFORCED_COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    //Gold
    public static final ItemEntry<GoldReinforcedCopperBacktankItem.GoldReinforcedCopperBacktankBlockItem> GOLD_REINFORCED_COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("gold_reinforced_copper_backtank_placeable", p -> new GoldReinforcedCopperBacktankItem.GoldReinforcedCopperBacktankBlockItem(ModBlocks.GOLD_REINFORCED_COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();
    public static final ItemEntry<? extends GoldArmorItem> GOLD_REINFORCED_COPPER_BACKTANK = REGISTRATE
            .item("gold_reinforced_copper_backtank", p -> new GoldReinforcedCopperBacktankItem(p, GOLD_REINFORCED_COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    //Diamond
    public static final ItemEntry<DiamondReinforcedCopperBacktankItem.DiamondReinforcedCopperBacktankBlockItem> DIAMOND_REINFORCED_COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("diamond_reinforced_copper_backtank_placeable", p -> new DiamondReinforcedCopperBacktankItem.DiamondReinforcedCopperBacktankBlockItem(ModBlocks.DIAMOND_REINFORCED_COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();
    public static final ItemEntry<? extends DiamondArmorItem> DIAMOND_REINFORCED_COPPER_BACKTANK = REGISTRATE
            .item("diamond_reinforced_copper_backtank", p -> new DiamondReinforcedCopperBacktankItem(p, DIAMOND_REINFORCED_COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    //Netherite
    public static final ItemEntry<NetheriteReinforcedCopperBacktankItem.NetheriteReinforcedCopperBacktankBlockItem> NETHERITE_REINFORCED_COPPER_BACKTANK_PLACEABLE = REGISTRATE
            .item("netherite_reinforced_copper_backtank_placeable", p -> new NetheriteReinforcedCopperBacktankItem.NetheriteReinforcedCopperBacktankBlockItem(ModBlocks.NETHERITE_REINFORCED_COPPER_BACKTANK.get(), p))
            .model((c, p) -> p.withExistingParent(c.getName(), p.mcLoc("item/barrier")))
            .register();
    public static final ItemEntry<? extends NetheriteArmorItem> NETHERITE_REINFORCED_COPPER_BACKTANK = REGISTRATE
            .item("netherite_reinforced_copper_backtank", p -> new NetheriteReinforcedCopperBacktankItem(p, NETHERITE_REINFORCED_COPPER_BACKTANK_PLACEABLE))
            .model(AssetLookup.customGenericItemModel("_", "item"))
            .register();

    public static void register() {}

}
