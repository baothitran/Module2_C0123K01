package practice2;
//Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
public class Cau4 {
    public static int hasZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,7,9,0,3,4};
        System.out.println(hasZero(arr));
    }
}
