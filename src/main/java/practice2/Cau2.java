package practice2;
//Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố trong mảng 1 chiều các số nguyên
public class Cau2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println("Vị trí " + i + " có giá trị là số nguyên tố");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
