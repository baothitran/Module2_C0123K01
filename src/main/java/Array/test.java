package Array;
import java.util.Scanner;

public class test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean checkActionMenu = false;
        do {
            System.out.println("chọn chức năng muốn in ra:");
            System.out.println("Nhấn 1: Tính tổng của 1 mảng");
            System.out.println("Nhấn 2: Đếm mảng có bao nhiêu số chẳn");
            System.out.println("Nhấn 3: Tìm giá trị lớn nhất của mảng");
            System.out.println("Nhấn 4: Thêm phần tử vào mảng");
            System.out.println("Nhấn 5: Xóa phần tử của mảng");
            System.out.println("Nhấn 6: Gộp 2 mảng a và b với nhau");
            int actionMenu = scanner.nextInt();

            switch (actionMenu){
                case 1:
                    System.out.printf("Tổng giá trị của mảng %s \n",sumArr(array));
                    break;
                case 2:
                    System.out.printf("Có số %s chẳn trong mảng  \n",countEvenNumbers(array));
                    break;
                case 3:
                    System.out.printf("Số %s là số lớn nhất trong mảng \n",maxValue(array));
                    break;
                case 4:
                    System.out.printf("Thêm phần tử vào mảng \n");
                    addElement(array);
                    break;
            }
            checkActionMenu = true;
        }while (checkActionMenu);

    }
    public static int [] array = {1, 2, 11, 4, 9};

    //Tính tổng của mảng:
    public static int sumArr(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //Đếm xem trong mảng có bao nhiêu số chẳn
    public static int countEvenNumbers(int [] arr){
        int num = 0;
        for (int i = 0;i < arr.length; i++){
            if (arr[i] % 2 == 0){
                num++;
            }
        }
        return num;
    }
    //Tìm giá trị lớn nhất của mảng
    public static  int maxValue(int [] arr){
        int max = arr[0];
        for (int i = 0;i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //Thêm phần tử vào mảng
    public static int[] addElement(int[] arr){
        //tạo một mảng giả có độ dài bằng mảng chính cộng thêm 1
        int[] tempArr = new int[arr.length + 1];
        //sao chép mảng chính sang mảng giả
        for (int i = 0;i < arr.length;i++){
            tempArr[i] = arr[i];
        }
        //thêm phần tử mới vào mảng
        tempArr[arr.length] = 17;
        //gán lại mảng giả vào mảng chính
        arr = tempArr;
        return arr;
    }

}
