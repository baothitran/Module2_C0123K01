package collectionprograms;

import java.util.Map;
import java.util.TreeMap;

//Q25 Write a program to iterate TreeMap in java?
public class Q25 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "Hello");
        treeMap.put(2, "CodeGym");
        treeMap.put(3, "Huế");
        for(Map.Entry<Integer,String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue() );
        }
    }
}
