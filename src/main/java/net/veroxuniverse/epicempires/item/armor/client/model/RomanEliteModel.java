package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.RomanEliteArmor;

public class RomanEliteModel extends GeoModel<RomanEliteArmor> {
    @Override
    public ResourceLocation getModelResource(RomanEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/roman_elite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RomanEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/roman_elite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RomanEliteArmor spartanArmor) {
        return null;
    }
}