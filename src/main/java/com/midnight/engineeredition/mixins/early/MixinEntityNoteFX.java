package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityNoteFX.class)
public abstract class MixinEntityNoteFX extends EntityFX {

    protected MixinEntityNoteFX(World p_i1218_1_, double p_i1218_2_, double p_i1218_4_, double p_i1218_6_) {
        super(p_i1218_1_, p_i1218_2_, p_i1218_4_, p_i1218_6_);
    }

    @Inject(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "TAIL"))
    private void onInit(World world, double unk, double unk1, double unk2, double col, double unk3, double unk4,
        float unk5, CallbackInfo ci) {
        this.particleRed = MathHelper.sin(((float) col + 0.0F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
        this.particleGreen = MathHelper.sin(((float) col + 0.33333334F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
        this.particleBlue = MathHelper.sin(((float) col + 0.6666667F) * (float) Math.PI * 2.0F) * 0.65F + 0.35F;
    }
}
