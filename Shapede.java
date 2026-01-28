interface Drawable {
    void draw();
}
abstract class Shape {
    abstract double area();
}
class Circle extends Shape implements Drawable {
    double radius = 5;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape implements Drawable {
    double length = 4, width = 6;
    @Override
    double area() {
        return length * width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Shapede {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
