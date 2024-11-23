package com.teamremastered.endrem.blocks;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

@MethodsReturnNonnullByDefault
public enum ERFrameProperties implements StringRepresentable {
    EMPTY,
    OLD_EYE,
    ROGUE_EYE,
    TECTONIC_EYE,
    COLD_EYE,
    CORRUPTED_EYE,
    MAGICAL_EYE,
    LOST_EYE,
    WITHER_EYE,
    GUARDIAN_EYE,
    WITCH_EYE,
    CURSED_EYE,
    EXOTIC_EYE,
    EVIL_EYE,
    UNDEAD_EYE,
    TOXIC_EYE;

    public String toString() {
        return this.getSerializedName();
    }

    public String getSerializedName() {
        return switch (this) {
            case EMPTY -> "empty";
            case OLD_EYE -> "old_eye";
            case ROGUE_EYE -> "rogue_eye";
            case TECTONIC_EYE -> "tectonic_eye";
            case COLD_EYE -> "cold_eye";
            case CORRUPTED_EYE -> "corrupted_eye";
            case MAGICAL_EYE -> "magical_eye";
            case LOST_EYE -> "lost_eye";
            case WITHER_EYE -> "wither_eye";
            case GUARDIAN_EYE -> "guardian_eye";
            case WITCH_EYE -> "witch_eye";
            case CURSED_EYE -> "cursed_eye";
            case EXOTIC_EYE -> "exotic_eye";
            case EVIL_EYE -> "evil_eye";
            case UNDEAD_EYE -> "undead_eye";
            case TOXIC_EYE -> "toxic_eye";
        };
    }

    public static ERFrameProperties getFramePropertyFromEye(Item eye) {

        for (ERFrameProperties property : ERFrameProperties.values()) {
            // match the serialized name of the property to the item name of the eye
            ResourceLocation eyeRegistryName = ForgeRegistries.ITEMS.getKey(eye);
            assert eyeRegistryName != null;
            if (property.toString().equals(eyeRegistryName.toString().split(":")[1])) {
                return property;
            }
        }

        return EMPTY;
    }
}
