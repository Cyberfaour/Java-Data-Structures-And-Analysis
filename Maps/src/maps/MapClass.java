package maps;

import java.util.ArrayList;
import java.util.List;

import javax.swing.RowFilter.Entry;

public class MapClass<K, V> implements Map<K, V> {
    private List<Entry<K, V>> entries;

    public MapClass() {
        entries = new ArrayList<>();
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    @Override
    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        entries.add(new Entry<>(key, value));
        return null;
    }

    @Override
    public V remove(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                V value = entry.getValue();
                entries.remove(entry);
                return value;
            }
        }
        return null;
    }

    @Override
    public Iterable<K> keySet() {
        List<K> keys = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }

    @Override
    public Iterable<V> valueSet() {
        List<V> values = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        List<Entry<K, V>> entrySet = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            entrySet.add(entry);
        }
        return entrySet;
    }

    public static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

}}
