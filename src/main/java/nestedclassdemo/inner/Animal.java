package nestedclassdemo.inner;

public class Animal {
    //inner class
    public class Dog{
        private int ten;
        public void hello() {
            System.out.println("hello");
        }
    }
    public class Husky extends Dog{

    }

    public static void main(String[] args) {
        Animal an = new Animal();
        Animal.Dog d = an.new Dog();
        d.hello();
    }
}
