package newdemo;

public class Student8 {
    int rollno;
    String name;
    static String college = "Bưu chính viễn thông";

    Student8(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
    public static void main(String arg[]) {
        Student8 s1 = new Student8(111,"Thông");
        Student8 s2 = new Student8(222,"Minh");
        s1.display();
        s2.display();
    }
}
