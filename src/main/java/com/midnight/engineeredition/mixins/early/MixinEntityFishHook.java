package com.midnight.engineeredition.mixins.early;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(EntityFishHook.class)
public abstract class MixinEntityFishHook extends Entity {

    @Shadow
    public abstract void func_146035_c(double p_146035_1_, double p_146035_3_, double p_146035_5_, float p_146035_7_,
        float p_146035_8_);

    public MixinEntityFishHook(World worldIn) {
        super(worldIn);
    }

    @Inject(
        method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/projectile/EntityFishHook;setLocationAndAngles(DDDFF)V"),
        cancellable = true)
    public void con(World p_i1766_1_, EntityPlayer p_i1766_2_, CallbackInfo ci) {
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
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0F * (float) EngineerEditionCore.PI) * f;
        this.func_146035_c(this.motionX, this.motionY, this.motionZ, 1.5F, 1.0F);
        ci.cancel();
    }
}
