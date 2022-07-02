package io.github.stachesebastian.createab.register.backtanks.diamond;

import com.simibubi.create.Create;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;

public class DiamondArmorItem extends ArmorItem {

    public static final ResourceLocation TEXTURE = Create.asResource("textures/models/armor/copper.png");
    private static final String TEXTURE_STRING = TEXTURE.toString();

    public DiamondArmorItem(EquipmentSlot slot, Properties properties) {
        super(ArmorMaterials.DIAMOND, slot, properties.stacksTo(1));
    }

    public boolean isWornBy(Entity entity) {
        if (!(entity instanceof LivingEntity))
            return false;
        LivingEntity livingEntity = (LivingEntity) entity;
        return livingEntity.getItemBySlot(slot).getItem() == this;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return TEXTURE_STRING;
    }

}
