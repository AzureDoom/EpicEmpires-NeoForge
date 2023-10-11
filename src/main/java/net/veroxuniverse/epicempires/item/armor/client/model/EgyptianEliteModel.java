package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.EgyptianEliteArmor;

public class EgyptianEliteModel extends GeoModel<EgyptianEliteArmor> {
    @Override
    public ResourceLocation getModelResource(EgyptianEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/egyptian_elite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EgyptianEliteArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/egyptian_elite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EgyptianEliteArmor spartanArmor) {
        return null;
    }
}