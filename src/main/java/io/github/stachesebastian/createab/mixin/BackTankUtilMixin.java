package io.github.stachesebastian.createab.mixin;

import com.simibubi.create.content.curiosities.armor.BackTankUtil;
import io.github.stachesebastian.createab.register.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BackTankUtil.class)
public class BackTankUtilMixin {

    @Inject(method = "get", at = @At("HEAD"), cancellable = true, remap = false)
    private static void onGet(LivingEntity entity, CallbackInfoReturnable<ItemStack> cir) {
        for (ItemStack itemStack : entity.getArmorSlots())
            if (ModItems.IRON_REINFORCED_COPPER_BACKTANK.isIn(itemStack))
                cir.setReturnValue(itemStack);
            else if (ModItems.GOLD_REINFORCED_COPPER_BACKTANK.isIn(itemStack))
                cir.setReturnValue(itemStack);
            else if (ModItems.DIAMOND_REINFORCED_COPPER_BACKTANK.isIn(itemStack))
                cir.setReturnValue(itemStack);
            else if (ModItems.NETHERITE_REINFORCED_COPPER_BACKTANK.isIn(itemStack))
                cir.setReturnValue(itemStack);
    }
}
