package net.veroxuniverse.epicempires.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AncientGoldItem extends Item {
    public AncientGoldItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.epicempires.ancient_gold.tooltip.shift1"));
            pTooltipComponents.add(Component.translatable("tooltip.epicempires.ancient_gold.tooltip.shift2"));
            pTooltipComponents.add(Component.translatable("tooltip.epicempires.ancient_gold.tooltip.shift3"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.epicempires.ancient_gold.tooltip"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
