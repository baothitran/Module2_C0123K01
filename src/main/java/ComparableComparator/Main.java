package ComparableComparator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student("Hai", 18));
        studentList.add(new Student("Abc", 17));
        studentList.add(new Student("Xyz", 19));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getAge()-o2.getAge();
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}