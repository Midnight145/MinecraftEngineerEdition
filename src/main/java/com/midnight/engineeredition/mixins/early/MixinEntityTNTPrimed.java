package com.midnight.engineeredition.mixins.early;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityTNTPrimed.class)
public abstract class MixinEntityTNTPrimed extends Entity {

    public MixinEntityTNTPrimed(World worldIn) {
        super(worldIn);
    }

    @Inject(
        method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/EntityLivingBase;)V",
        at = @At(value = "TAIL"))
    public void con(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_,
        EntityLivingBase p_i1730_8_, CallbackInfo ci) {
        float f = (float) (Math.random() * Math.PI * 2.0D);
        this.motionX = -((float) Math.sin(f)) * 0.02F;
        this.motionY = 0.20000000298023224D;
        this.motionZ = -((float) Math.cos(f)) * 0.02F;
    }
}
