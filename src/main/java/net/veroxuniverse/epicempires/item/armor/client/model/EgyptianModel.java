package net.veroxuniverse.epicempires.item.armor.client.model;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicempires.EpicEmpires;
import net.veroxuniverse.epicempires.item.armor.custom.EgyptianArmor;

public class EgyptianModel extends GeoModel<EgyptianArmor> {
    @Override
    public ResourceLocation getModelResource(EgyptianArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "geo/egyptian_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EgyptianArmor spartanArmor) {
        return new ResourceLocation(EpicEmpires.MOD_ID, "textures/armor/egyptian_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EgyptianArmor spartanArmor) {
        return null;
    }
}