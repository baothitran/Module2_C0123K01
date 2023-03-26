package DSA.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(6);
        s.add(21);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(28);
        for (Integer n : s){
            System.out.println(n + " " + n.hashCode());
        }
    }

}
