package collectionprograms;

import java.util.HashMap;
import java.util.HashSet;

//Q13 Write a program to add elements to HashSet?
public class Q13 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Gà");
        hashSet.add("Vịt");
        hashSet.add("Heo");
        hashSet.add("Bò");
        for(String str : hashSet) {
            System.out.printf("%s ", str);
        }
    }
}
