/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

/**
 *
 * @author Cyberfaour
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new map
        MapClass<String, Integer> map = new MapClass<>();

        // Put some key-value pairs
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Get the value for a specific key
        Integer value = map.get("B");
        System.out.println("Value for key 'B': " + value);

        // Remove a key-value pair
        Integer removedValue = map.remove("A");
        System.out.println("Removed value for key 'A': " + removedValue);

        // Check the size of the map
        int size = map.size();
        System.out.println("Map size: " + size);

        // Iterate over the keys
        Iterable<String> keys = map.keySet();
        System.out.println("Keys:");
        for (String key : keys) {
            System.out.println(key);
        }

        // Iterate over the values
        Iterable<Integer> values = map.valueSet();
        System.out.println("Values:");
        for (Integer val : values) {
            System.out.println(val);
        }

        // Iterate over the entries
        // Iterable<MapClass.Entry<String, Integer>> entries = map.entrySet();
        // System.out.println("Entries:");
        // for (MapClass.Entry<String, Integer> entry : entries) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue());
        // }
    }
    
}
