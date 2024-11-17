package com.teamremastered.endrem.registers;

import com.teamremastered.endrem.EndRemastered;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ERTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndRemastered.MOD_ID);

    public static void initRegister(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }

    public static final RegistryObject<CreativeModeTab> EYES_TAB = TABS.register("endrem_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.endrem.endrem_tab"))
                    .icon(() -> new ItemStack(ERItems.EXOTIC_EYE.get()))
                    .displayItems((featureFlags, output) -> {
                        output.accept(ERItems.BLACK_EYE.get());
                        output.accept(ERItems.COLD_EYE.get());
                        output.accept(ERItems.CORRUPTED_EYE.get());
                        output.accept(ERItems.LOST_EYE.get());
                        output.accept(ERItems.OLD_EYE.get());
                        output.accept(ERItems.CURSED_EYE.get());
                        output.accept(ERItems.EVIL_EYE.get());

                        output.accept(ERItems.GUARDIAN_EYE.get());
                        output.accept(ERItems.MAGICAL_EYE.get());
                        output.accept(ERItems.WITHER_EYE.get());

                        output.accept(ERItems.EXOTIC_EYE.get());

                        output.accept(ERItems.TOXIC_EYE.get());

                        System.out.println("Items Registered");
                    } )
                    .build()
    );
}