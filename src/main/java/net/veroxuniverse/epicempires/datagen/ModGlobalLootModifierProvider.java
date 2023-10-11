package net.veroxuniverse.epicempires.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntries;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntry;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.loot.AddSusSandModifier;
import net.veroxuniverse.epicempires.registry.ItemsRegistry;
import net.veroxuniverse.epicempires.loot.AddItemModifier;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, EpicEmpires.MOD_ID);
    }

    @Override
    protected void start() {

        //* ANCIENT GOLD *//

        add("ancient_gold_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_nether_fortress", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_nether_bastion1", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_nether_bastion2", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_nether_bastion3", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_nether_bastion4", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));
        
        add("ancient_gold_from_ruined_portal", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_suspicious_sand1", new AddSusSandModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        add("ancient_gold_from_suspicious_sand2", new AddSusSandModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build() },
                ItemsRegistry.ANCIENT_GOLD_INGOT.get()));

        //* ANCIENT IRON *//

        add("ancient_iron_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_nether_fortress", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_nether_bastion1", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_nether_bastion2", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_nether_bastion3", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_nether_bastion4", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_ruined_portal", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.45f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_suspicious_sand1", new AddSusSandModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));

        add("ancient_iron_from_suspicious_sand2", new AddSusSandModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build() },
                ItemsRegistry.ANCIENT_IRON_INGOT.get()));


    }
}