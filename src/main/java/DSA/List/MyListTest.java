package DSA.List;

import DSA.List.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println(listInteger);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.subList(0,2));

//        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(0));


    }
}
