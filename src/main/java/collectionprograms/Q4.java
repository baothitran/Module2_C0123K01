package collectionprograms;

import java.util.ArrayList;

//Given an element write a program to check if element(value) exists in ArrayList?
public class Q4 {
    public static void main(String[] args) {
        String[] arr = {"Hoàn", "Đạt", "Hưng","Pháp", "Nghĩa"};
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length;i++) {
            arrayList.add(arr[i]);
        }
        if (arrayList.contains("Hoàn")) {
            System.out.println("Đã tìm thấy từ khoá");
        } else {
            System.out.println("Không tìm thấy từ khoá");
        }
    }

}
