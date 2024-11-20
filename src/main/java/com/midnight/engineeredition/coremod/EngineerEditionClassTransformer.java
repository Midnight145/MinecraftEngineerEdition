package com.midnight.engineeredition.coremod;

import static org.objectweb.asm.Opcodes.ASM5;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.launchwrapper.IClassTransformer;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import com.midnight.engineeredition.EngineerEditionCore;
import com.midnight.engineeredition.coremod.asm.IAsmEditor;

public class EngineerEditionClassTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String s, String s1, byte[] bytes) {
        if (bytes == null) return null;

        for (IAsmEditor editor : EngineerEditionCore.editors) {
            if (s1.equals(editor.getClassName())) bytes = updateMethod(bytes, editor);
        }

        return bytes;
    }

    private byte[] updateMethod(byte[] bytes, IAsmEditor editor) {
        ClassReader reader = new ClassReader(bytes);
        ClassNode node = new ClassNode(ASM5);
        reader.accept(node, 0);
        Map<String, String> mapCopy = new HashMap<>(editor.getMethodInfo());
        for (MethodNode method : node.methods) {
            for (Map.Entry<String, String> edit : editor.getMethodInfo()
                .entrySet()) {
                if (method.name.equals(edit.getKey()) && method.desc.equals(edit.getValue())) {
                    mapCopy.remove(edit.getKey());
                    editor.edit(method);
                    break;
                }
            }
        }
        if (!mapCopy.isEmpty()) {
            StringBuilder str = new StringBuilder();
            for (Map.Entry<String, String> edit : mapCopy.entrySet()) {
                str.append(edit.getKey())
                    .append(": ")
                    .append(edit.getValue())
                    .append("\n");
            }
            throw new RuntimeException(
                "EngineerEditionCore failed to find the following methods:\n" + str.toString()
                    + "in class: "
                    + editor.getClassName());
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        node.accept(writer);
        return writer.toByteArray();
    }
}
