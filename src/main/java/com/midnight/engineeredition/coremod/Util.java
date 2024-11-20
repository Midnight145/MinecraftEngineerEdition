package com.midnight.engineeredition.coremod;

import java.util.HashMap;
import java.util.Map;

public class Util {

    public static Map<String, String> of(String... args) {
        Map<String, String> map = new HashMap<>();
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid number of arguments");
        }
        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }
        return map;
    }
}
