package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.RomanModel;
import net.veroxuniverse.epicempires.item.armor.custom.RomanArmor;

public class RomanRenderer extends GeoArmorRenderer<RomanArmor> {
    public RomanRenderer() {
        super(new RomanModel());
    }
}

