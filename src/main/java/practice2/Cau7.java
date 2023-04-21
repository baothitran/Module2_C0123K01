package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
public class Cau7 {

//    public static void main(String[] args) {
//        int[] arr = {3, 6, -1, 2, 5, -4, 7, 9, -8};
//        int[] positiveArr = new int[arr.length];
//        int positiveIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                positiveArr[positiveIndex] = arr[i];
//                positiveIndex++;
//            }
//        }
//
//        Arrays.sort(positiveArr, 0, positiveIndex);
//
//
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                arr[i] = positiveArr[j];
//                j++;
//            }
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
public static void main(String[] args) {
    int[] arr = {3, 6, -1, 2, 5, -4, 7, 9, -8};
    ArrayList<Integer> positiveList = new ArrayList<>();

    // Lấy tất cả các số dương trong mảng ban đầu và đưa vào ArrayList
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            positiveList.add(arr[i]);
        }
    }

    // Sắp xếp ArrayList theo thứ tự tăng dần
    Collections.sort(positiveList);

    // Sắp xếp lại mảng ban đầu, giữ nguyên vị trí các giá trị âm
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            arr[i] = positiveList.get(j);
            j++;
        }
    }

    // In ra mảng đã sắp xếp
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
