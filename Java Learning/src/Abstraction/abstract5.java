package Abstraction;

abstract class geoShape {
    abstract double area();

    abstract double perimeter();

}

class Triangle extends geoShape {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double area() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    double perimeter() {
        return s1 + s2 + s3;
    }
}

class Square extends geoShape {
    private double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    double area() {
        return l * l;
    }

    @Override
    double perimeter() {
        return 4 * l;
    }

}

class Circle extends geoShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }

}

class Rectangle extends geoShape {
    private double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    double area() {
        return l * b;
    }

    @Override
    double perimeter() {
        return (2 * l) + (2 * b);
    }

}


public class abstract5 {
    public static void main(String[] args) {

        geoShape s1 = new Square(5);
        geoShape t1 = new Triangle(3, 4, 5);
        geoShape c1 = new Circle(6);
        geoShape r1 = new Rectangle(2, 4);

        System.out.println("Area of Square: " + s1.area());
        System.out.println("Perimeter of Square: " + s1.perimeter());
        System.out.println("Area of Triangle: " + t1.area());
        System.out.println("Perimeter of Triangle: " + t1.perimeter());
        System.out.println("Area of Circle: " + c1.area());
        System.out.println("Perimeter of Circle: " + c1.perimeter());
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Perimeter of Rectangle: " + r1.perimeter());
    }
}
