package Array;

public class TotalArray {
    public static void main(String[] args) {
        int[] arr = {2,7,8,6,3,5};
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }
        System.out.printf("Kết quả là: %s",total);
    }
}
