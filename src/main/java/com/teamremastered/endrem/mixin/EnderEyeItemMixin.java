package com.teamremastered.endrem.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnderEyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnderEyeItem.class)
public class EnderEyeItemMixin {
    @Inject(method = "useOn", at = @At("HEAD"), cancellable = true)
    private void endrem$useOn(UseOnContext ctx, CallbackInfoReturnable<InteractionResult> cir){
        if (ctx.getLevel().getBlockState(ctx.getClickedPos()).is(Blocks.END_PORTAL_FRAME)) {
            Player player = ctx.getPlayer();
            if (player != null) {
                player.displayClientMessage(Component.translatable("block.endrem.ender_eye.use_warning"), true);
            }
            cir.setReturnValue(InteractionResult.PASS);
        }
    }

    @Inject(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;startUsingItem(Lnet/minecraft/world/InteractionHand;)V", shift = At.Shift.BEFORE), cancellable = true)
    private void endrem$use(Level level, Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir){
        player.displayClientMessage(Component.translatable("block.endrem.ender_eye.throw_warning"), true);
        ItemStack item = player.getItemInHand(hand);
        cir.setReturnValue(InteractionResultHolder.pass(item));
    }
}
