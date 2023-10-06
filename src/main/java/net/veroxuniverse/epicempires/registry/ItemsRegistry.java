package net.veroxuniverse.epicempires.registry;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.SpartanArmor;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicEmpires.MOD_ID);

    public static final RegistryObject<Item> SPARTAN_HELMET = ITEMS.register("spartan_helmet",
            () -> new SpartanArmor(ArmorMaterials.GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_CHESTPLATE = ITEMS.register("spartan_chestplate",
            () -> new SpartanArmor(ArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_LEGGINGS = ITEMS.register("spartan_leggings",
            () -> new SpartanArmor(ArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_BOOTS = ITEMS.register("spartan_boots",
            () -> new SpartanArmor(ArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
