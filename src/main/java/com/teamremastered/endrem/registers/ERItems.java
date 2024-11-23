package com.teamremastered.endrem.registers;

import com.teamremastered.endrem.EndRemastered;
import com.teamremastered.endrem.items.EREnderEye;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ERItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndRemastered.MOD_ID);

    public static void initRegister(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    // ==== Eyes ====


    // chests
    public static final RegistryObject<Item> COLD_EYE = ITEMS.register("cold_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> CORRUPTED_EYE = ITEMS.register("corrupted_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> LOST_EYE = ITEMS.register("lost_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> OLD_EYE = ITEMS.register("old_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> CURSED_EYE = ITEMS.register("cursed_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> EVIL_EYE = ITEMS.register("evil_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));

    // entities
    public static final RegistryObject<Item> GUARDIAN_EYE = ITEMS.register("guardian_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> MAGICAL_EYE = ITEMS.register("magical_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
    public static final RegistryObject<Item> WITHER_EYE = ITEMS.register("wither_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));

    // crafts
    public static final RegistryObject<Item> EXOTIC_EYE = ITEMS.register("exotic_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));

    // ???

    public static final RegistryObject<Item> TOXIC_EYE = ITEMS.register("toxic_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));



    public static final RegistryObject<Item> TECTONIC_EYE = ITEMS.register("tectonic_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(16)));
}
