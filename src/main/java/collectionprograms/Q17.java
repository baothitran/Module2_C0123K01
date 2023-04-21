package collectionprograms;

import java.util.HashMap;
import java.util.TreeMap;

//Q17 Write a program to sort HashMap by keys ?
public class Q17 {
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static void sortByKey() {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(hashMap);
        for(HashMap.Entry<String, Integer> entry: sorted.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
    public static void main(String[] args) {
        hashMap.put("Gà", 2);
        hashMap.put("Vịt", 5);
        hashMap.put("Heo", 7);
        sortByKey();

    }

}
