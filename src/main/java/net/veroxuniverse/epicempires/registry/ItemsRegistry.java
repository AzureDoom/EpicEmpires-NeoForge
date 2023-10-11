package net.veroxuniverse.epicempires.registry;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.AncientGoldItem;
import net.veroxuniverse.epicempires.item.AncientIronItem;
import net.veroxuniverse.epicempires.item.armor.custom.*;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicEmpires.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_GOLD_INGOT = ITEMS.register("ancient_gold_ingot",
            () -> new AncientGoldItem(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ANCIENT_IRON_INGOT = ITEMS.register("ancient_iron_ingot",
            () -> new AncientIronItem(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SPARTAN_HELMET = ITEMS.register("spartan_helmet",
            () -> new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_CHESTPLATE = ITEMS.register("spartan_chestplate",
            () -> new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_LEGGINGS = ITEMS.register("spartan_leggings",
            () -> new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_BOOTS = ITEMS.register("spartan_boots",
            () -> new SpartanArmor(ArmorMaterialsRegistry.SPARTAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_ELITE_HELMET = ITEMS.register("spartan_elite_helmet",
            () -> new SpartanEliteArmor(ArmorMaterialsRegistry.ELITE_SPARTAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_ELITE_CHESTPLATE = ITEMS.register("spartan_elite_chestplate",
            () -> new SpartanEliteArmor(ArmorMaterialsRegistry.ELITE_SPARTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_ELITE_LEGGINGS = ITEMS.register("spartan_elite_leggings",
            () -> new SpartanEliteArmor(ArmorMaterialsRegistry.ELITE_SPARTAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_ELITE_BOOTS = ITEMS.register("spartan_elite_boots",
            () -> new SpartanEliteArmor(ArmorMaterialsRegistry.ELITE_SPARTAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_SWORD = ITEMS.register("spartan_sword",
            () -> new SwordItem(ItemMaterialsRegistry.SPARTAN, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_SPEAR = ITEMS.register("spartan_spear",
            () -> new SwordItem(ItemMaterialsRegistry.SPARTAN, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_SHIELD = ITEMS.register("spartan_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> SPARTAN_ELITE_SHIELD = ITEMS.register("spartan_elite_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> ROMAN_HELMET = ITEMS.register("roman_helmet",
            () -> new RomanArmor(ArmorMaterialsRegistry.ROMAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_CHESTPLATE = ITEMS.register("roman_chestplate",
            () -> new RomanArmor(ArmorMaterialsRegistry.ROMAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_LEGGINGS = ITEMS.register("roman_leggings",
            () -> new RomanArmor(ArmorMaterialsRegistry.ROMAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_BOOTS = ITEMS.register("roman_boots",
            () -> new RomanArmor(ArmorMaterialsRegistry.ROMAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROMAN_ELITE_HELMET = ITEMS.register("roman_elite_helmet",
            () -> new RomanEliteArmor(ArmorMaterialsRegistry.ELITE_ROMAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_ELITE_CHESTPLATE = ITEMS.register("roman_elite_chestplate",
            () -> new RomanEliteArmor(ArmorMaterialsRegistry.ELITE_ROMAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_ELITE_LEGGINGS = ITEMS.register("roman_elite_leggings",
            () -> new RomanEliteArmor(ArmorMaterialsRegistry.ELITE_ROMAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_ELITE_BOOTS = ITEMS.register("roman_elite_boots",
            () -> new RomanEliteArmor(ArmorMaterialsRegistry.ELITE_ROMAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROMAN_GLADIUS = ITEMS.register("roman_gladius",
            () -> new SwordItem(ItemMaterialsRegistry.ROMAN, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_SPEAR = ITEMS.register("roman_spear",
            () -> new SwordItem(ItemMaterialsRegistry.ROMAN, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ROMAN_SHIELD = ITEMS.register("roman_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ROMAN_ELITE_SHIELD = ITEMS.register("roman_elite_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> EGYPTIAN_HELMET = ITEMS.register("egyptian_helmet",
            () -> new EgyptianArmor(ArmorMaterialsRegistry.EGYPTIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_CHESTPLATE = ITEMS.register("egyptian_chestplate",
            () -> new EgyptianArmor(ArmorMaterialsRegistry.EGYPTIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_LEGGINGS = ITEMS.register("egyptian_leggings",
            () -> new EgyptianArmor(ArmorMaterialsRegistry.EGYPTIAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_BOOTS = ITEMS.register("egyptian_boots",
            () -> new EgyptianArmor(ArmorMaterialsRegistry.EGYPTIAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> EGYPTIAN_ELITE_HELMET = ITEMS.register("egyptian_elite_helmet",
            () -> new EgyptianEliteArmor(ArmorMaterialsRegistry.ELITE_EGYPTIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_ELITE_CHESTPLATE = ITEMS.register("egyptian_elite_chestplate",
            () -> new EgyptianEliteArmor(ArmorMaterialsRegistry.ELITE_EGYPTIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_ELITE_LEGGINGS = ITEMS.register("egyptian_elite_leggings",
            () -> new EgyptianEliteArmor(ArmorMaterialsRegistry.ELITE_EGYPTIAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_ELITE_BOOTS = ITEMS.register("egyptian_elite_boots",
            () -> new EgyptianEliteArmor(ArmorMaterialsRegistry.ELITE_EGYPTIAN, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> EGYPTIAN_KHOPESH = ITEMS.register("egyptian_khopesh",
            () -> new SwordItem(ItemMaterialsRegistry.EGYPTIAN, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_FAN_AXE = ITEMS.register("egyptian_fan_axe",
            () -> new SwordItem(ItemMaterialsRegistry.EGYPTIAN, 4, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> EGYPTIAN_SHIELD = ITEMS.register("egyptian_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> EGYPTIAN_ELITE_SHIELD = ITEMS.register("egyptian_elite_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
