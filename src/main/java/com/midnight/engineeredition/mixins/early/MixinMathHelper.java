package com.midnight.engineeredition.mixins.early;

import net.minecraft.util.MathHelper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.midnight.engineeredition.EngineerEditionCore;

@Mixin(MathHelper.class)
public class MixinMathHelper {

    @Unique
    private static boolean minecraft_Engineer_Edition$hasRegeneratedTable = false;

    @Shadow
    private static float[] SIN_TABLE = new float[65536];

    @Inject(method = "sin", at = @At(value = "HEAD"))
    private static void im_an_engineer_sin(float f, CallbackInfoReturnable<Float> ci) {
        if (!minecraft_Engineer_Edition$hasRegeneratedTable) {
            for (int val = 0; val < 65536; ++val) {
                SIN_TABLE[val] = (float) Math.sin((double) val * EngineerEditionCore.PI * 2.0D / 65536.0D);
            }
            minecraft_Engineer_Edition$hasRegeneratedTable = true;
        }
    }

}
