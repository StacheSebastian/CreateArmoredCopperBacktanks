package io.github.stachesebastian.createab.register.backtanks.netherite;

import com.simibubi.create.content.curiosities.armor.CopperBacktankBlock;
import com.simibubi.create.content.curiosities.armor.CopperBacktankTileEntity;
import io.github.stachesebastian.createab.register.ModItems;
import io.github.stachesebastian.createab.register.ModTiles;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public class NetheriteReinforcedCopperBacktankBlock extends CopperBacktankBlock {

    public NetheriteReinforcedCopperBacktankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter p_185473_1_, BlockPos p_185473_2_, BlockState p_185473_3_) {
        ItemStack item = ModItems.NETHERITE_REINFORCED_COPPER_BACKTANK.asStack();
        Optional<CopperBacktankTileEntity> tileEntityOptional = getTileEntityOptional(p_185473_1_, p_185473_2_);

        int air = tileEntityOptional.map(CopperBacktankTileEntity::getAirLevel)
                .orElse(0);
        CompoundTag tag = item.getOrCreateTag();
        tag.putInt("Air", air);

        ListTag enchants = tileEntityOptional.map(CopperBacktankTileEntity::getEnchantmentTag)
                .orElse(new ListTag());
        if (!enchants.isEmpty()) {
            ListTag enchantmentTagList = item.getEnchantmentTags();
            enchantmentTagList.addAll(enchants);
            tag.put("Enchantments", enchantmentTagList);
        }

        Component customName = tileEntityOptional.map(CopperBacktankTileEntity::getCustomName)
                .orElse(null);
        if (customName != null)
            item.setHoverName(customName);
        return item;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModTiles.NETHERITE_REINFORCED_COPPER_BACKTANK.create(pos, state);
    }
}
