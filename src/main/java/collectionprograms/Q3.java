package collectionprograms;

import java.util.HashMap;
import java.util.HashSet;

//Q3 Write a program to traverse(or iterate) HashSet?
public class Q3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Huế");
        hashSet.add("Hà Nội");
        hashSet.add("Đà Nẵng");
        hashSet.add("Quảng Trị");
        for(String hs : hashSet) {
            System.out.printf("%s ", hs);
        }
    }
}
