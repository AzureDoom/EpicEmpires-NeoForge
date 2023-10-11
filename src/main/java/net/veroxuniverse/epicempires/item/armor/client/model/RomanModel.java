package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.RomanArmor;

public class RomanModel extends GeoModel<RomanArmor> {
    @Override
    public ResourceLocation getModelResource(RomanArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/roman_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RomanArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/roman_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RomanArmor spartanArmor) {
        return null;
    }
}