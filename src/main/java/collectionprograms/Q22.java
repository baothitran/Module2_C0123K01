package collectionprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Q22 Write a program to convert LinkedList to ArrayList?
public class Q22 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(12);
        linkedList.add(23);
        linkedList.add(27);
        linkedList.add(10);

        List<Integer> list = new ArrayList(linkedList);
        for(Integer num : list) {
            System.out.println(num);
        }
    }
}
