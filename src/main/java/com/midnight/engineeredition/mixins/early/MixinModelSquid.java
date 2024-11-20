package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSquid;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(ModelSquid.class)
public class MixinModelSquid {

    @Shadow
    ModelRenderer[] squidTentacles = new ModelRenderer[8];

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    public void onInit(CallbackInfo ci) {
        for (int i = 0; i < this.squidTentacles.length; ++i) {
            double d0 = (double) i * EngineerEditionCore.PI * 2.0D / (double) this.squidTentacles.length;
            this.squidTentacles[i].rotationPointX = (float) Math.cos(d0) * 5.0F;
            this.squidTentacles[i].rotationPointZ = (float) Math.sin(d0) * 5.0F;
            d0 = (double) i * Math.PI * -2.0D / (double) this.squidTentacles.length + (EngineerEditionCore.PI / 2D);
            this.squidTentacles[i].rotateAngleY = (float) d0;
        }
    }
}
