package collectionprograms;

import java.util.HashSet;

//Q5 Given an element write a program to check if element exists in HashSet?
public class Q5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Táo");
        hashSet.add("Lê");
        hashSet.add("Dâu");
        hashSet.add("Nho");

        if (hashSet.contains("Chanh")) {
            System.out.println("Đã tìm thấy từ khoá");
        } else {
            System.out.println("Không tìm thấy từ khoá");
        }
    }
}
