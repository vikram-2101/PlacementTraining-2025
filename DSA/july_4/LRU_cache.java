import java.util.LinkedHashMap;

public class LRU_cache {
    int capacity;
    LinkedHashMap<Integer, Integer> cache;

    public LRU_cache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        if (!cache.containsKey(key))
            return -1;
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
        } else {
            if (cache.size() >= capacity) {
                int oldkey = cache.keySet().iterator().next();
                cache.remove(oldkey);
            }
            cache.put(key, value);
        }
    }
}
