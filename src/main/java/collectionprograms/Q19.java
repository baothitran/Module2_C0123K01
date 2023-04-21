package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

//Q19 Write a program to sort ArrayList in descending order?
public class Q19 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Rồng");
        arrayList.add("Leo");
        arrayList.add("Mèo");
        arrayList.add("Mửa");

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);
    }
}
