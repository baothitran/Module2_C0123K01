package collectionprograms;

import java.util.ArrayList;

//Q2 Write a program to convert List to Array
public class Q2 {
    public static void main(String[] args) {
        int[] arr= {9,7,0,6,8,12,81};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            arrayList.add(arr[i]);
        }
        Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);
        for(Integer num: array) {
            System.out.printf("%s ", + num);
        }

    }
}
