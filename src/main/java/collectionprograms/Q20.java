package collectionprograms;

import java.util.ArrayList;

//Q20 Write a program to add element at particular index of ArrayList?
public class Q20 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(10);
        arrayList.add(3,12);
        System.out.println(arrayList);
    }

}
