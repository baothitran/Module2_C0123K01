package OOP;

public class Demo1 {
    protected int sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        int s = d.sum(10, 20);
        System.out.println(s);
    }

}
