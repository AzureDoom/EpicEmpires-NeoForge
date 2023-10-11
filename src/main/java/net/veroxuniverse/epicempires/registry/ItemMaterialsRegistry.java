package net.veroxuniverse.epicempires.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemMaterialsRegistry {

    public static final ForgeTier SPARTAN = new ForgeTier(4, 1561, 12.0f,
            5.0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier ROMAN = new ForgeTier(4, 1561, 12.0f,
            5.0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier EGYPTIAN = new ForgeTier(4, 1561, 12.0f,
            5.0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.IRON_INGOT));

}
