package aryahmph;

import java.util.HashMap;
import java.util.Map;

public class LordOfCrimeSolution {
    public static String[] lordOfCrime(String[] names) {
        int namesLen = names.length;

        // Register array into HahsMap
        Map<String, Integer> map = new HashMap<>(namesLen);
        for (String name : names) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        // Logic
        String maxKey = names[0];
        int maxVal = map.get(maxKey);

        // Search largest value from key
        for (String key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxKey = key;
                maxVal = map.get(maxKey);
            }
        }

        return new String[]{maxKey, Integer.toString(map.get(maxKey))};
    }
}
