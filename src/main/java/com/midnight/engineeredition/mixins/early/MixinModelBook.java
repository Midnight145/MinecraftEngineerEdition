package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.model.ModelBook;
import net.minecraft.client.model.ModelRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(ModelBook.class)
public class MixinModelBook {

    @Shadow
    public ModelRenderer bookSpine;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void constructorOverwrite(CallbackInfo ci) {
        this.bookSpine.rotateAngleY = ((float) EngineerEditionCore.PI / 2F);
    }
}
