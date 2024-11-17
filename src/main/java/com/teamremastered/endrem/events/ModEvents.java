package com.teamremastered.endrem.events;

import com.teamremastered.endrem.registers.ERItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnderEyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber
public class ModEvents {

    public static class EREyeTrade implements VillagerTrades.ItemListing {

        @Nullable
        @Override
        public MerchantOffer getOffer(Entity entity, RandomSource random) {
            int maxPrice = 50;
            int minPrice = 30;
            int priceEmeralds = random.nextInt(maxPrice - minPrice) + minPrice;
            if (!entity.level().isClientSide()) {
                return new MerchantOffer(new ItemStack(Items.EMERALD, priceEmeralds), new ItemStack(Items.RABBIT_FOOT), new ItemStack(ERItems.EVIL_EYE.get()), 12, 10, 0.2F);
            }
            return null;
        }
    }
}
