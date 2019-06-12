package collections

import collections.ListInterface.Student

class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(4, "four")
        hashMap.put(5, "Five");
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");
        println hashMap

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(2, "Two");
        println linkedHashMap

        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');
        println treeMap

        HashMap<Integer, Character> characterHashMap = new HashMap<>()
        characterHashMap.put(6, 'A')
        characterHashMap.put(5, 'B')
        characterHashMap.put(1, 'C')
        characterHashMap.put(2, 'D')
        characterHashMap.put(8, 'E')
        println characterHashMap


        HashMap<String, Integer> wordNumberMapping = new HashMap<>()

        // Adding new key-value pairs to the LinkedHashMap
        wordNumberMapping.put("three", 3)
        wordNumberMapping.put("four", 4)
        wordNumberMapping.put("one", 1)
        wordNumberMapping.put("two", 2)


        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        wordNumberMapping.putIfAbsent("five", 5)

        wordNumberMapping.

                println(wordNumberMapping)
    }


}
