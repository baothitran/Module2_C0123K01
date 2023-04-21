package nestedclassdemo.inner;

public class DogSub {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal.Dog d = an.new Dog();
        d.hello();
    }

}
