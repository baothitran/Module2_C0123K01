package Homework;

public class Cylinder extends Circle{

    private float height;

    public Cylinder() {
        // ở đây mặc định là nó gọi đi đâu              ???
        // gọi trực tiếp Constructor của lớp cha (lớp Circle)
//        super();
    }

    public Cylinder(float height, float radius, String color) {
        // Cách 1: super(radius, color) cái này để làm gì       ??
        // gọi trực tiếp biến của lớp Circle
        super(radius, color);


        // Cách 2:  Vì sao ở đây this.color và this.radius được      ???
        // Vì được thừa kế từ lớp Circle
//        this.color = color;
//        this.radius = radius;

        // Cách 3:     setColor(color);  vì sao gọi được        ???
        // Vì được thừa kế từ lớp Circle
//        setColor(color);    // có thể dùng: this.setColor(color);
//        setRadius(radius);

        // cách 4: super.setColor(color); vì sao gọi được       ???
        // vì super gọi trực tiếp phuuwong thức của lớp Circle
//        super.setColor(color);
//        super.setRadius(radius);

        this.height = height;

    }

    // Tại sao phải ghi đè phương thức getArea()            ???
    // Vì Cylinder được  thừa kế getArea của lớp Circle nhưng muốn thể hiện getArea theo cách của nó nên phải ghi đè
    @Override
    public float getArea() {
        // Nếu lấy this.getArea() thì chuyện gì sẽ xảy ra       ???
         // Nếu lấy this.getArea() thì sẽ lấy getArea của lớp Cylinder và bị lặp đi lặp lại
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder: %s, color: %s, Area: %s",
                this.radius, color, this.getArea() );
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3, 10, "RED");
        System.out.println(cylinder);

        // Ở đây sử dụng tính chất gì, nói ra                       ???
        // Tính chất đa hình, cho phép một biến thuộc kiểu dữ liệu cha có thể trỏ đến một đối tượng thuộc lớp con
        Circle c1 = new Cylinder(3, 10, "BLUE");

        // c1.getArea();            lấy phương thức của lớp nào để thực hìện             ???
        // lấy phương thức của lớp con
        float area = c1.getArea();
        System.out.println("Area c1: " + area);
    }
}