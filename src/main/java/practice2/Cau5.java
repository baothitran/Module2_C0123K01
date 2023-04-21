package practice2;
//Bài 5: Kiểm tra mảng có giảm dần hay không
public class Cau5 {
    public static void main(String[] args) {
        int[] arr = {9,6,1,12,5,7};
        boolean isDescending = true;

        if (isDecrease(arr)) {
            System.out.println("Mảng không giảm dần");
        } else {
            System.out.println("Mảng có giảm dần");
        }
    }

    public static boolean isDecrease(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
