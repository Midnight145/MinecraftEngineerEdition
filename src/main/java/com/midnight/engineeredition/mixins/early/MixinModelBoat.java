package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.model.ModelRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(ModelBoat.class)
public class MixinModelBoat {

    @Shadow
    public ModelRenderer[] boatSides;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void constructorOverwrite(CallbackInfo ci) {
        this.boatSides[0].rotateAngleX = ((float) EngineerEditionCore.PI / 2F);
        this.boatSides[1].rotateAngleY = ((float) EngineerEditionCore.PI * 3F / 2F);
        this.boatSides[2].rotateAngleY = ((float) EngineerEditionCore.PI / 2F);
        this.boatSides[3].rotateAngleY = (float) EngineerEditionCore.PI;
    }
}
