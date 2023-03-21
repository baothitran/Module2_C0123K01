package AbstractClassNInterface;

class Student2 {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student2() {
    }

    public Student2(int id, String name, int age, String address) {
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
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name
                + ",age=" + age + ",address=" + address;
    }
}
