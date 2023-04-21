package collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;

//Q8  Write a program to convert Array to List?
public class Q8 {
    public static void main(String[] args) {
        Integer[] arr = {9,13,6,32,57,22};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.add(120);
        arrayList.add(71);
        System.out.println(arrayList);

    }

}
