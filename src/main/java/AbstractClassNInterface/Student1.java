package AbstractClassNInterface;

class Student1 implements Comparable <Student1> {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student1() {
    }

    public Student1(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // getter & setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name
                + ",age=" + age + ",address=" + address;
    }

    @Override
    public int compareTo(Student1 student) {
        return this.getName().compareTo(student.getName());
    }
}
