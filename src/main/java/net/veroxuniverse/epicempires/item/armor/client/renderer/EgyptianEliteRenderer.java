package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.EgyptianEliteModel;
import net.veroxuniverse.epicempires.item.armor.custom.EgyptianEliteArmor;

public class EgyptianEliteRenderer extends GeoArmorRenderer<EgyptianEliteArmor> {
    public EgyptianEliteRenderer() {
        super(new EgyptianEliteModel());
    }
}

