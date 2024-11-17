package com.teamremastered.endrem.mixin;

import net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@SuppressWarnings("unused")
@Mixin(StrongholdPieces.PortalRoom.class)
public class StrongholdPiecesMixin {
    @ModifyConstant(method = "postProcess", constant = @Constant(floatValue = 0.9F))
    private float frameHasEyeOdds(float originalValue) {
        return 0F;
    }
}