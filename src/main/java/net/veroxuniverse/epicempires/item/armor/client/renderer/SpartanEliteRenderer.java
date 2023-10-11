package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.SpartanEliteModel;
import net.veroxuniverse.epicempires.item.armor.custom.SpartanEliteArmor;

public class SpartanEliteRenderer extends GeoArmorRenderer<SpartanEliteArmor> {
    public SpartanEliteRenderer() {
        super(new SpartanEliteModel());
    }
}

