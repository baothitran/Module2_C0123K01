package collectionprograms;

import java.util.HashMap;

//Q10 Write a program to add elements to the HashMap given the key and value data type is String?
public class Q10 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1", "Thi");
        hashMap.put("2","Thuỷ");
        hashMap.put("3","Bin");
        System.out.println(hashMap);
    }

}
