package com.midnight.engineeredition.mixins.early;

import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(ModelHorse.class)
public class MixinModelHorse {

    @Shadow
    private ModelRenderer muleLeftChest;

    @Shadow
    private ModelRenderer muleRightChest;

    @Shadow
    private void setBoxRotation(ModelRenderer p_110682_1_, float p_110682_2_, float p_110682_3_, float p_110682_4_) {}

    @Inject(method = "<init>", at = @At("TAIL"))
    private void constructorOverwrite(CallbackInfo ci) {
        this.setBoxRotation(this.muleLeftChest, 0.0F, ((float) EngineerEditionCore.PI / 2F), 0.0F);
        this.setBoxRotation(this.muleRightChest, 0.0F, ((float) EngineerEditionCore.PI / 2F), 0.0F);
    }
}
