package collectionprograms;

import java.util.HashSet;
//Q23 Write a program to convert HashSet to Array?
public class Q23 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Gần");
        hashSet.add("Mực");
        hashSet.add("Thì");
        hashSet.add("Đen");
        String[] arr = new String[hashSet.size()];
        hashSet.toArray(arr);
        for(String str : arr) {
            System.out.println(str);
        }
    }
}
