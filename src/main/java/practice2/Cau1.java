package practice2;
//Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
public class Cau1 {
    public static void main(String[] args) {
        int[] arr = { 45, 35};
        System.out.print("Các giá trị có chữ số lẻ là: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isAllOdd = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    isAllOdd = false;
                    break;
                }
                num /= 10;
            }
            if (isAllOdd) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
