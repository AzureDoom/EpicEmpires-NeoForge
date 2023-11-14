package net.veroxuniverse.epicempires;

import com.mojang.logging.LogUtils;
import mod.azure.azurelibarmor.AzureLib;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.veroxuniverse.epicempires.item.ModItemProperties;
import net.veroxuniverse.epicempires.registry.CreativeTabRegistry;
import net.veroxuniverse.epicempires.registry.ItemsRegistry;
import net.veroxuniverse.epicempires.loot.ModLootModifiers;
import org.slf4j.Logger;

@Mod(EpicEmpires.MOD_ID)
public class EpicEmpires
{

    public static final String MOD_ID = "epicempires";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EpicEmpires()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        /** TODO: Remove this call as unneeded **/
        AzureLib.initialize();

        ItemsRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");

            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();
            });

        }
    }
}
