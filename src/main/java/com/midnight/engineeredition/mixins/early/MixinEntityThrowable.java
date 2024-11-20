package com.midnight.engineeredition.mixins.early;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(EntityThrowable.class)
public abstract class MixinEntityThrowable extends Entity {

    @Shadow
    abstract public void setThrowableHeading(double p_70186_1_, double p_70186_3_, double p_70186_5_, float p_70186_7_,
        float p_70186_8_);

    @Shadow
    abstract protected float func_70183_g();

    @Shadow
    abstract protected float func_70182_d();

    public MixinEntityThrowable(World worldIn) {
        super(worldIn);
    }

    @Inject(
        method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/projectile/EntityThrowable;setLocationAndAngles(DDDFF)V"),
        cancellable = true)
    public void con1(World p_i1777_1_, EntityLivingBase p_i1777_2_, CallbackInfo ci) {
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI) * 0.16F;
        this.posY -= 0.10000000149011612D;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI) * 0.16F;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        float f = 0.4F;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI)
            * MathHelper.cos(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI)
            * f;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) EngineerEditionCore.PI)
            * MathHelper.cos(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI)
            * f;
        this.motionY = -MathHelper
            .sin((this.rotationPitch + this.func_70183_g()) / 180.0F * (float) EngineerEditionCore.PI) * f;
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.func_70182_d(), 1.0F);
        ci.cancel();
    }
}
