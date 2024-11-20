package com.midnight.engineeredition.mixins.early;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(EntityItem.class)
public class MixinEntityItem {

    @Shadow
    public float hoverStart;

    @Inject(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "TAIL"))
    public void con1(World worldIn, double x, double y, double z, CallbackInfo ci) {
        this.hoverStart = (float) (Math.random() * EngineerEditionCore.PI * 2.0D);
    }

    @Inject(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "TAIL"))
    public void con2(World p_i1711_1_, CallbackInfo ci) {
        this.hoverStart = (float) (Math.random() * EngineerEditionCore.PI * 2.0D);
    }
}
