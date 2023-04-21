package collectionprograms;

import java.util.HashMap;

//Q6 Write a program to initialize a HashMap in java ?
public class Q6 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Code");
        hashMap.put(2,"Gym");
        hashMap.put(3,"Huế");
        System.out.println(hashMap);

    }
}
