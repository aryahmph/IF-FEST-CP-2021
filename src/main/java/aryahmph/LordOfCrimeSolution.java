package aryahmph;

import java.util.HashMap;
import java.util.Map;

public class LordOfCrimeSolution {
    public static String lordOfCrime(String[] names) {
        int namesLen = names.length;

        // Register array into HahsMap
        Map<String, Integer> map = new HashMap<>(namesLen);
        for (int i = 0; i < namesLen; i++) {
            if (map.containsKey(names[i])) {
                map.put(names[i], map.get(names[i]) + 1);
            } else {
                map.put(names[i], 1);
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

        return maxKey;
    }
}
