package com.wilk.main;

import java.util.LinkedHashMap;


public class LRUCache<T> {

    LRUMap map;

    class LRUMap<K,V> extends LinkedHashMap<K,V> {

        int MAX_NUM;

        LRUMap(int capacity) {
            super(capacity);
            MAX_NUM = capacity;
        }
    }
    public T get(T key) {

        if (map==null || map.get(key) == null)  return null;

        T value = (T)map.get(key);
        map.remove(key);
        map.put(key,value);
        return value;

    }

    public void put(T key, T value) {
        if (map == null) return;
        map.get(key);
        map.put(key,value);

    }
}
