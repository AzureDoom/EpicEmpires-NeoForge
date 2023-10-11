package net.veroxuniverse.epicempires.item.armor.client.renderer;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicempires.item.armor.client.model.EgyptianModel;
import net.veroxuniverse.epicempires.item.armor.custom.EgyptianArmor;

public class EgyptianRenderer extends GeoArmorRenderer<EgyptianArmor> {
    public EgyptianRenderer() {
        super(new EgyptianModel());
    }
}

