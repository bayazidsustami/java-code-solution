package org.example.codesolution.lrucache;

import java.util.LinkedHashSet;

public class LRUCache {

    public static String arrayChallenge(String[] strArr) {
        final int CACHE_SIZE = 5;
        LinkedHashSet<String> cache = new LinkedHashSet<>(CACHE_SIZE);

        for (String element : strArr) {
            if (cache.contains(element)) {
                cache.remove(element);
            } else {
                if (cache.size() == CACHE_SIZE) {
                    cache.remove(cache.iterator().next());
                }
            }
            cache.add(element);
        }
        return String.join("-", cache);
    }
}
