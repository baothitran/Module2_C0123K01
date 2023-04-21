package practice2;

import java.util.Arrays;

//Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
public class Cau8 {
    public static void main(String[] args) {
        int[] arr = {3, 6, -1, 2, 5, -4, 7, 9, -8};
        int[] oddArr = new int[arr.length];
        int oddIndex = 0;

        // Lấy tất cả các số lẻ trong mảng ban đầu
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        // Sắp xếp mảng lẻ theo thứ tự tăng dần
        Arrays.sort(oddArr, 0, oddIndex);

        // Sắp xếp lại mảng ban đầu, giữ nguyên vị trí các giá trị khác
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddArr[j];
                j++;
            }
        }

        // In ra mảng đã sắp xếp
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
