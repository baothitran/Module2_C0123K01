package collectionprograms;

import java.util.ArrayList;

//Q21 Write a program to remove element from specified index of ArrayList?
public class Q21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(10);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
