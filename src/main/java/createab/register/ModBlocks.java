package createab.register;

import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import createab.register.backtanks.gold.GoldReinforcedCopperBacktankBlock;
import createab.register.backtanks.iron.IronReinforcedCopperBacktankBlock;
import createab.CreateArmoredCopperBacktanks;
import createab.register.backtanks.diamond.DiamondReinforcedCopperBacktankBlock;
import createab.register.backtanks.netherite.NetheriteReinforcedCopperBacktankBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import static com.simibubi.create.AllTags.pickaxeOnly;

public class ModBlocks {

    private static final CreateRegistrate REGISTRATE = CreateArmoredCopperBacktanks.registrate()
            .creativeModeTab(() -> CreateArmoredCopperBacktanks.createabtab);


    //Iron
    public static final BlockEntry<IronReinforcedCopperBacktankBlock> IRON_REINFORCED_COPPER_BACKTANK =
            REGISTRATE.block("iron_reinforced_copper_backtank", IronReinforcedCopperBacktankBlock::new)
                    .initialProperties(SharedProperties::copperMetal)
                    .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
                    .transform(pickaxeOnly())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(BlockStressDefaults.setImpact(4.0))
                    .loot((lt, block) -> {
                        LootTable.Builder builder = LootTable.lootTable();
                        LootItemCondition.Builder survivesExplosion = ExplosionCondition.survivesExplosion();
                        lt.add(block, builder.withPool(LootPool.lootPool()
                                .when(survivesExplosion)
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.IRON_REINFORCED_COPPER_BACKTANK.get())
                                        .apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Air", "Air"))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Enchantments", "Enchantments")))));
                    })
                    .register();

    //Gold
    public static final BlockEntry<GoldReinforcedCopperBacktankBlock> GOLD_REINFORCED_COPPER_BACKTANK =
            REGISTRATE.block("gold_reinforced_copper_backtank", GoldReinforcedCopperBacktankBlock::new)
                    .initialProperties(SharedProperties::copperMetal)
                    .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
                    .transform(pickaxeOnly())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(BlockStressDefaults.setImpact(4.0))
                    .loot((lt, block) -> {
                        LootTable.Builder builder = LootTable.lootTable();
                        LootItemCondition.Builder survivesExplosion = ExplosionCondition.survivesExplosion();
                        lt.add(block, builder.withPool(LootPool.lootPool()
                                .when(survivesExplosion)
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.GOLD_REINFORCED_COPPER_BACKTANK.get())
                                        .apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Air", "Air"))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Enchantments", "Enchantments")))));
                    })
                    .register();

    //Diamond
    public static final BlockEntry<DiamondReinforcedCopperBacktankBlock> DIAMOND_REINFORCED_COPPER_BACKTANK =
            REGISTRATE.block("diamond_reinforced_copper_backtank", DiamondReinforcedCopperBacktankBlock::new)
                    .initialProperties(SharedProperties::copperMetal)
                    .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
                    .transform(pickaxeOnly())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(BlockStressDefaults.setImpact(4.0))
                    .loot((lt, block) -> {
                        LootTable.Builder builder = LootTable.lootTable();
                        LootItemCondition.Builder survivesExplosion = ExplosionCondition.survivesExplosion();
                        lt.add(block, builder.withPool(LootPool.lootPool()
                                .when(survivesExplosion)
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.DIAMOND_REINFORCED_COPPER_BACKTANK.get())
                                        .apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Air", "Air"))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Enchantments", "Enchantments")))));
                    })
                    .register();

    //Netherite
    public static final BlockEntry<NetheriteReinforcedCopperBacktankBlock> NETHERITE_REINFORCED_COPPER_BACKTANK =
            REGISTRATE.block("netherite_reinforced_copper_backtank", NetheriteReinforcedCopperBacktankBlock::new)
                    .initialProperties(SharedProperties::copperMetal)
                    .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
                    .transform(pickaxeOnly())
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(BlockStressDefaults.setImpact(4.0))
                    .loot((lt, block) -> {
                        LootTable.Builder builder = LootTable.lootTable();
                        LootItemCondition.Builder survivesExplosion = ExplosionCondition.survivesExplosion();
                        lt.add(block, builder.withPool(LootPool.lootPool()
                                .when(survivesExplosion)
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.NETHERITE_REINFORCED_COPPER_BACKTANK.get())
                                        .apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Air", "Air"))
                                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                                .copy("Enchantments", "Enchantments")))));
                    })
                    .register();



    public static void register() {}
}
