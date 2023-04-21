package practice2;
//Đếm số lượng giá trị tận cùng bằng 5 trong mảng
public class Cau3 {
    public static void main(String[] args) {
        int[] arr = {23,41,55,62,35,94,65};
        System.out.println("Số lượng giá trị tận cùng bằng 5 trong mảng là: "+ countEndsWith5(arr));
    }
    public static int countEndsWith5(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 5) {
                count++;
            }
        }
        return count;
    }
}
