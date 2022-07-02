package io.github.stachesebastian.createab.register.backtanks.gold;

import com.simibubi.create.content.curiosities.armor.BackTankUtil;
import com.simibubi.create.content.curiosities.armor.CapacityEnchantment;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;

public class GoldReinforcedCopperBacktankItem extends GoldArmorItem implements CapacityEnchantment.ICapacityEnchantable {
    public static final int DURABILITY_BAR = 15724527;
    private ItemEntry<GoldReinforcedCopperBacktankBlockItem> blockItem;

    public GoldReinforcedCopperBacktankItem(Properties p_i48534_3_, ItemEntry<GoldReinforcedCopperBacktankBlockItem> GoldReinforcedCopperBacktankPlaceable) {
        super(EquipmentSlot.CHEST, p_i48534_3_);
        this.blockItem = GoldReinforcedCopperBacktankPlaceable;
    }

    public InteractionResult useOn(UseOnContext p_195939_1_) {
        return ((GoldReinforcedCopperBacktankBlockItem)this.blockItem.get()).useOn(p_195939_1_);
    }

    public boolean canBeDepleted() {
        return false;
    }

    public boolean isEnchantable(ItemStack p_77616_1_) {
        return true;
    }

    public void fillItemCategory(CreativeModeTab p_150895_1_, NonNullList<ItemStack> p_150895_2_) {
        if (this.allowdedIn(p_150895_1_)) {
            ItemStack stack = new ItemStack(this);
            CompoundTag nbt = new CompoundTag();
            nbt.putInt("Air", BackTankUtil.maxAirWithoutEnchants());
            stack.setTag(nbt);
            p_150895_2_.add(stack);
        }
    }

    public boolean isBarVisible(ItemStack stack) {
        return true;
    }

    public int getBarWidth(ItemStack stack) {
        return Math.round(13.0F * Mth.clamp((float)getRemainingAir(stack) / (float)BackTankUtil.maxAir(stack), 0.0F, 1.0F));
    }

    public int getBarColor(ItemStack stack) {
        return 15724527;
    }

    public static int getRemainingAir(ItemStack stack) {
        CompoundTag orCreateTag = stack.getOrCreateTag();
        return orCreateTag.getInt("Air");
    }

    public static class GoldReinforcedCopperBacktankBlockItem extends BlockItem {
        public GoldReinforcedCopperBacktankBlockItem(Block pBlock, Properties pProperties) {
            super(pBlock, pProperties);
        }

        public void fillItemCategory(CreativeModeTab pGroup, NonNullList<ItemStack> pItems) {
        }

        public String getDescriptionId() {
            return this.getOrCreateDescriptionId();
        }
    }
}
