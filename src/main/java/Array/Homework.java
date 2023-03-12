package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkActionMenu = false;
        int[] a = {2, 5, 6, 7, 8};
        printArray(a);
        int[] b = {6, 1, 9, 5, 4};
        printArray(b);

        do {
            System.out.println("Chọn chức năng cần in ra");
            System.out.println("Nhấn 1: Tính tổng các giá trị trong mảng");
            System.out.println("Nhấn 2: Đếm xem mảng có bao nhiêu số chẵn");
            System.out.println("Nhấn 3: Tìm giá trị nhỏ nhất của mảng");
            System.out.println("Nhấn 4: Thêm phần tử vào mảng");
            System.out.println("Nhấn 5: Xóa phần tử khỏi mảng");
            System.out.println("Nhấn 6: Gộp 2 mảng a, b lại với nhau");
            int actionMenu = scanner.nextInt();

            switch (actionMenu) {
                case 1:
                    System.out.printf("Kết quả: %s \n \n", sumArray(a));
                    break;
                case 2:
                    System.out.printf("Kết quả: %s số chẵn trong mảng \n \n", countEven(a));
                    break;
                case 3:
                    System.out.printf("Kết quả: %s là giá trị nhỏ nhất \n \n", findMin(a));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.printf("Kết quả: %s \n \n", Arrays.toString(mergeArray(a,b)));
                    break;
                default:
                    System.out.println("Vui lòng nhập số phù hợp");
            }
            checkActionMenu = true;
        } while (checkActionMenu);
    }

    public static int sumArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;

    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length;i++) {
            merge[i] = arr1[i];
        }
        for (int j=0; j<arr2.length; j++) {
            merge[arr1.length + j] = arr2[j];
        }
        return merge;
    }
        public static void printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }



