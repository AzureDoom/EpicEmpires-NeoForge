package net.veroxuniverse.epicempires.item.armor.custom;

import mod.azure.azurelibarmor.animatable.client.RenderProvider;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.veroxuniverse.epicempires.item.armor.ModArmorItem;
import net.veroxuniverse.epicempires.item.armor.client.renderer.EgyptianEliteRenderer;
import net.veroxuniverse.epicempires.item.armor.client.renderer.EgyptianRenderer;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class EgyptianEliteArmor extends ModArmorItem {
    public EgyptianEliteArmor(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    /*

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private EgyptianEliteRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                   EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new EgyptianEliteRenderer();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

     */

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private EgyptianEliteRenderer renderer = null;

            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null)
                    return new EgyptianEliteRenderer();
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

}
