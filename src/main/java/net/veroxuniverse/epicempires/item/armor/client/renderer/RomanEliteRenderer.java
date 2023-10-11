package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.RomanEliteModel;
import net.veroxuniverse.epicempires.item.armor.custom.RomanEliteArmor;

public class RomanEliteRenderer extends GeoArmorRenderer<RomanEliteArmor> {
    public RomanEliteRenderer() {
        super(new RomanEliteModel());
    }
}

