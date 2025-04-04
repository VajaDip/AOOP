abstract class Shape {
    abstract void CalculateArea();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void CalculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle are is :- " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void CalculateArea() {
        double area = length * width;
        System.out.println("Rectangle area is :- " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void CalculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area is :- " + area);
    }
}

public class practical20 {
    public static void main(String[] args) {
        Shape t = new Triangle(5, 7);
        Shape r = new Rectangle(4, 4);
        Shape c = new Circle(3);

        t.CalculateArea();
        r.CalculateArea();
        c.CalculateArea();
    }
}
