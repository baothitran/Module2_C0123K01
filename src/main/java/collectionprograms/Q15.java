package collectionprograms;

import java.util.HashMap;

public class Q15 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        System.out.println("hashMap đang trống? " + hashMap.isEmpty());
        hashMap.put("1", "Mèo");
        hashMap.put("2", "Mả");
        hashMap.put("3", "Gà");
        hashMap.put("4", "Đồng");
        System.out.println("hashMap đang trống? " + hashMap.isEmpty());
    }
}
