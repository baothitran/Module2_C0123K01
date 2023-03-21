package AbstractClassNInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableExample {
    public static void main(String[] args) {

        List<Student1> listStudents = new ArrayList<Student1>();

        listStudents.add(new Student1(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student1(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student1(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student1(4, "Quy", 22, "Hanoi"));

        Collections.sort(listStudents);

        for (Student1 student : listStudents) {
            System.out.println(student.toString());
        }
    }
}