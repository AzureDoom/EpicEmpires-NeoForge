package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.SpartanEliteArmor;

public class SpartanEliteModel extends GeoModel<SpartanEliteArmor> {
    @Override
    public ResourceLocation getModelResource(SpartanEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/spartan_elite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpartanEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/spartan_elite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpartanEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "animations/empty.animation.json");
    }
}