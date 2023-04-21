package collectionprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Q16 Write a program to iterate the HashMap ?
public class Q16 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Cá sấu");
        hashMap.put(2, "Khủng long");
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext()) {
            Integer key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + hashMap.get(key));
        }

    }
}
