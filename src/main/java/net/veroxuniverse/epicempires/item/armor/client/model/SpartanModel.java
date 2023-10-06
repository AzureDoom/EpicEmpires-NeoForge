package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.SpartanArmor;

public class SpartanModel extends GeoModel<SpartanArmor> {
    @Override
    public ResourceLocation getModelResource(SpartanArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/spartan_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpartanArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/spartan_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpartanArmor spartanArmor) {
        return null;
    }
}