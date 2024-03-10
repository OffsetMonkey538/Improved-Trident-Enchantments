package com.dplayend.ite.api;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;

@FunctionalInterface
public interface TridentThrowListener {

    void accept(TridentEntity thrownTrident, ItemStack tridentItem, PlayerEntity user, float pitch, float yaw, float roll, float speed, float divergence);
}
