package com.midnight.engineeredition.coremod.asm;

import java.util.Map;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

import com.midnight.engineeredition.EngineerEditionCore;

public interface IAsmEditor {

    default void edit(MethodNode method) {
        for (AbstractInsnNode insn : method.instructions.toArray()) {
            if (insn.getOpcode() == Opcodes.LDC) {
                LdcInsnNode ldc = (LdcInsnNode) insn;
                if (ldc.cst instanceof Double && (Double) ldc.cst == Math.PI) {
                    method.instructions.set(insn, new LdcInsnNode(EngineerEditionCore.PI));
                }
            }
        }
    }

    String getClassName();

    Map<String, String> getMethodInfo();

    default String getCorrectSymbol(String obfuscated, String deobfuscated) {
        return EngineerEditionCore.isObfuscated ? obfuscated : deobfuscated;
    }
}
