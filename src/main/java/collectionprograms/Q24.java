package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

//Q24 Write a program to reverse ArrayList in java?
public class Q24 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Gần");
        arrayList.add("Đèn");
        arrayList.add("Thì");
        arrayList.add("Sáng");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
