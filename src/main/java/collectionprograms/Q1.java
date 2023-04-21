package collectionprograms;
// Q1. Write a program to traverse (or iterate) ArrayList?

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] arr= {9,23,45,12,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            arrayList.add(arr[i]);
        }
        for(Integer num: arrayList) {
            System.out.printf("%s ", + num);
        }

    }
}
