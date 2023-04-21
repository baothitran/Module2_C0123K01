package collectionprograms;

import java.util.HashSet;

//Q11 Write a program to initialize a HashSet in java?
public class Q11 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(10);
        hashSet.add(12);
        System.out.println(hashSet);
    }

}
