package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.SpartanModel;
import net.veroxuniverse.epicempires.item.armor.custom.SpartanArmor;

public class SpartanRenderer extends GeoArmorRenderer<SpartanArmor> {
    public SpartanRenderer() {
        super(new SpartanModel());
    }
}

