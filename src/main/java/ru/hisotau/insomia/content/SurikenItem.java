package ru.hisotau.insomia.content;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import ru.hisotau.insomia.init.Suriken;

public class SurikenItem extends Item {
    public SurikenItem(Item.Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack surikenStack = player.getItemInHand(hand);
        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));

        if (!level.isClientSide) {
            Suriken surikenEntity = new Suriken(level, player);
            surikenEntity.setItem(surikenStack);
            surikenEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 3.0F, 1.5F, 1.0F);
            level.addFreshEntity(surikenEntity);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            surikenStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(surikenStack, level.isClientSide());
    }
}
