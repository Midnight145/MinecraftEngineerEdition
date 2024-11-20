package com.midnight.engineeredition;

import static org.objectweb.asm.Opcodes.ASM5;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.launchwrapper.IClassTransformer;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class EngineerEditionClassTransformer implements IClassTransformer {

    private static final Map<Double, Double> lookup = new HashMap<>();
    static {
        double[] vals = { 1, 1.5, 2 };
        for (double val : vals) {
            lookup.put(Math.PI * val, EngineerEditionCore.PI * val);
            lookup.put(Math.PI / val, EngineerEditionCore.PI / val);
            lookup.put(-Math.PI / val, -EngineerEditionCore.PI / val);
            lookup.put(-Math.PI * val, -EngineerEditionCore.PI * val);
        }
    }

    @Override
    public byte[] transform(String s, String s1, byte[] bytes) {
        if (bytes == null) return null;

        bytes = updateClass(bytes, s1);
        return bytes;
    }

    private byte[] updateClass(byte[] bytes, String s1) {
        ClassReader reader = new ClassReader(bytes);
        ClassNode classNode = new ClassNode(ASM5);
        reader.accept(classNode, 0);

        for (MethodNode methodNode : classNode.methods) {
            updateMethod(methodNode, s1);
        }
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        return writer.toByteArray();
    }

    private void updateMethod(MethodNode method, String s1) {
        for (AbstractInsnNode insn : method.instructions.toArray()) {
            if (insn.getOpcode() == Opcodes.LDC) {
                LdcInsnNode ldc = (LdcInsnNode) insn;
                for (Double key : lookup.keySet()) {
                    if (fuzzyEquals(ldc.cst, key)) {
                        EngineerEditionCore.logger.info("Transforming: {} in class {}", method.name, s1);
                        Object replacementValue = null;
                        if (ldc.cst instanceof Float) {
                            replacementValue = lookup.get(key)
                                .floatValue();
                        } else if (ldc.cst instanceof Double) {
                            replacementValue = lookup.get(key);
                        }
                        method.instructions.set(insn, new LdcInsnNode(replacementValue));
                    }
                }

            }
        }
    }

    private static boolean fuzzyEquals(Object a, double b) {
        if (a instanceof Double a_) {
            return Math.abs(a_ - b) <= .00001;
        } else if (a instanceof Float a_) {
            return Math.abs(a_ - b) <= .00001;
        }
        return false;
    }
}
