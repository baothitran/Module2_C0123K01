package mycode;

class Outside{
    int a = 0;
    static class Inside {
        int b = 5;
    }
}
public class InnerClass{
    public static void main(String[] args) {
        Outside.Inside i = new Outside.Inside();
        System.out.println(i.b);
    }
}
