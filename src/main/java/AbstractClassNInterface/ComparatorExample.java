package AbstractClassNInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {
    public static void main(String[] args) {

        List<Student2> listStudents = new ArrayList<Student2>();

        listStudents.add(new Student2(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student2(2, "Hoa", 24, "Hanoi"));
        listStudents.add(new Student2(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student2(4, "Quy", 22, "Hanoi"));


        System.out.println("sort list student by it's name ASC: ");
        Collections.sort(listStudents, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student2 student : listStudents) {
            System.out.println(student.toString());
        }


        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudents, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });

        for (Student2 student : listStudents) {
            System.out.println(student.toString());
        }
    }
}