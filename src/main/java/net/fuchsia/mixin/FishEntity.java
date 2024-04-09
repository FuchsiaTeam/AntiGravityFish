package net.fuchsia.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class FishEntity extends net.minecraft.entity.passive.FishEntity {
    public FishEntity(EntityType<? extends net.minecraft.entity.passive.FishEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tickMovement() {
        setNoGravity(true);
        super.tickMovement();
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }

    @Override
    public ItemStack getBucketItem() {
        return null;
    }
}
