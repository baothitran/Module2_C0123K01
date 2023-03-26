package Homework.demo;

public class Manager {
    public void addNewElement(Object o) {

    }

    public static void main(String[] args) {
        Manager kieuAnh = new Manager();
        kieuAnh.addNewElement(new User());
        kieuAnh.addNewElement(new Employee());
//        Manager<User> a = new Manager();
    }
}
