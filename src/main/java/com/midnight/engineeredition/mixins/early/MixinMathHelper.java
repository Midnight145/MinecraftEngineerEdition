package com.midnight.engineeredition.mixins.early;

import net.minecraft.util.MathHelper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(MathHelper.class)
public class MixinMathHelper {

    @Shadow
    private static float[] SIN_TABLE = new float[65536];

    @Inject(method = "<clinit>", at = @At(value = "TAIL"))
    private static void overwriteTable(CallbackInfo ci) {
        for (int i = 0; i < 65536; ++i) {
            SIN_TABLE[i] = (float) Math.sin((double) i * EngineerEditionCore.PI * 2.0D / 65536.0D);
        }
    }
}
