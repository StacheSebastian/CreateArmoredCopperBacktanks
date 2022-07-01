package io.github.stachesebastian.createab.register;

import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import io.github.stachesebastian.createab.CreateArmoredCopperBacktanks;
import io.github.stachesebastian.createab.register.backtanks.iron.IronReinforcedCopperBacktankBlock;
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

    public static void register() {}
}
