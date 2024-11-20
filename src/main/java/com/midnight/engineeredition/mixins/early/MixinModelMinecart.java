package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.model.ModelMinecart;
import net.minecraft.client.model.ModelRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(ModelMinecart.class)
public class MixinModelMinecart {

    public ModelRenderer[] sideModels = new ModelRenderer[7];

    @Inject(method = "<init>", at = @At("TAIL"))
    private void constructorOverwrite(CallbackInfo ci) {
        this.sideModels[0].rotateAngleX = ((float) EngineerEditionCore.PI / 2F);
        this.sideModels[1].rotateAngleY = ((float) EngineerEditionCore.PI * 3F / 2F);
        this.sideModels[2].rotateAngleY = ((float) EngineerEditionCore.PI / 2F);
        this.sideModels[3].rotateAngleY = (float) EngineerEditionCore.PI;
        this.sideModels[5].rotateAngleX = -((float) EngineerEditionCore.PI / 2F);
    }
}
