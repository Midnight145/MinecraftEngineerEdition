package com.midnight.engineeredition.mixins.early;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(EntityArrow.class)
public abstract class MixinEntityArrow extends Entity {

    public MixinEntityArrow(World worldIn) {
        super(worldIn);
    }

    @Shadow
    public abstract void setThrowableHeading(double p_70186_1_, double p_70186_3_, double p_70186_5_, float p_70186_7_,
        float p_70186_8_);

    @Inject(
        method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;FF)V",
        at = @At(value = "TAIL"),
        locals = LocalCapture.CAPTURE_FAILSOFT)
    public void con1(World p_i1755_1_, EntityLivingBase p_i1755_2_, EntityLivingBase p_i1755_3_, float p_i1755_4_,
        float p_i1755_5_, CallbackInfo ci, double d0, double d1, double d2, double d3) {
        if (d3 >= 1.0E-7D) {
            float f2 = (float) (Math.atan2(d2, d0) * 180.0D / EngineerEditionCore.PI) - 90.0F;
            float f3 = (float) (-(Math.atan2(d1, d3) * 180.0D / EngineerEditionCore.PI));
            this.setLocationAndAngles(p_i1755_2_.posX + (d0 / d3), this.posY, p_i1755_2_.posZ + (d2 / d3), f2, f3);
        }
    }

    @Inject(
        method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;F)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/projectile/EntityArrow;setLocationAndAngles(DDDFF)V"),
        cancellable = true)
    public void con2(World p_i1756_1_, EntityLivingBase p_i1756_2_, float p_i1756_3_, CallbackInfo ci) {
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI) * 0.16F;
        this.posY -= 0.10000000149011612D;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI) * 0.16F;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI)
            * MathHelper.cos(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI);
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI)
            * MathHelper.cos(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI);
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, p_i1756_3_ * 1.5F, 1.0F);
        ci.cancel();
    }
}
