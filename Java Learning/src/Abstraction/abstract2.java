package Abstraction;

abstract class shape {
    abstract double calArea();

    abstract double calPeri();

}

class circle extends shape {
    private double r;

    public circle(double rad) {
        r = rad;
    }

    double calArea() {
        return Math.PI * (r * r);
    }

    double calPeri() {
        return 2 * Math.PI * r;
    }
}

class triangle extends shape {
    private double s1;
    private double s2;
    private double s3;

    public triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    double calArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    double calPeri() {
        return s1 + s2 + s3;
    }
}

public class abstract2 {
    public static void main(String[] args) {
        circle c1 = new circle(3);
        triangle t1 = new triangle(2, 3, 4);

        System.out.println("Area: " + c1.calArea());
        System.out.println("Perimeter: " + c1.calPeri());

        System.out.println("Area: " + t1.calArea());
        System.out.println("Perimeter: " + t1.calPeri());
    }


}
