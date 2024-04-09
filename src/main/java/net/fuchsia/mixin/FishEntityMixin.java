package net.fuchsia.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FishEntity.class)
public class FishEntityMixin {

	@Inject(at = @At("TAIL"), method = "<init>")
	private void init(CallbackInfo info) {
		((Entity)((Object)this)).setNoGravity(true);
	}

}