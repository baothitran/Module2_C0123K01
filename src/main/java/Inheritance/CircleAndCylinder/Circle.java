package Inheritance.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Inheritance.CircleAndCylinder.Circle circle = new Inheritance.CircleAndCylinder.Circle(3.0, "red");
        System.out.println(circle.getRadius());
    }

    public String toString() {
        return "Radius is: " + this.getRadius() + " color is: " + this.getColor();
    }
}
