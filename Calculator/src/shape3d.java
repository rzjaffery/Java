import java.util.Scanner;

abstract class shape3 {
    abstract double volume();

    abstract double surfacearea();
}

class Sphere extends shape3 {
    private double r;
    public double p = Math.PI;

    public Sphere(double r) {
        this.r = r;
    }

    double volume() {
        return ((double) 4 / 3) * p * Math.pow(r, 3);
    }

    double surfacearea() {
        return 4 * p * Math.pow(r, 2);
    }
}

class Cube extends shape3 {
    private double l;

    public Cube(double len) {
        l = len;
    }

    double volume() {
        return Math.pow(l, 3);
    }

    double surfacearea() {
        return 6 * Math.pow(l, 2);
    }
}

class Cuboid extends shape3 {
    private double l, b, h;

    public Cuboid(double len, double bre, double hei) {
        l = len;
        b = bre;
        h = hei;
    }

    double volume() {
        return l * b * h;
    }

    double surfacearea() {
        return 2 * ((l * b) + (b * h) + (l * h));
    }
}

class Cone extends shape3 {
    private double r, h, l;
    public double p = Math.PI;

    public Cone(double rad, double hei, double slant) {
        r = rad;
        h = hei;
        l = slant;
    }

    double volume() {
        return ((double) 1 / 3) * p * r * (2 * h);
    }

    double surfacearea() {
        return p * r * (r + l);
    }
}

class Cylinder extends shape3 {
    private double r, h;
    public double p = Math.PI;

    public Cylinder(double rad, double hei) {
        r = rad;
        h = hei;
    }

    double volume() {
        return 2 * p * r * h;
    }

    double surfacearea() {
        return 2 * p * r * (r + h);
    }
}

public class shape3d {

    public static void main() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Select Any 3D shape to find its Volume and SurfaceArea ");
        System.out.println("1) Sphere");
        System.out.println("2) Cube");
        System.out.println("3) Cuboid");
        System.out.println("4) Cone");
        System.out.println("5) Cylinder");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Sphere calculation ");
                System.out.print("radius: ");
                double r = scanner.nextDouble();
                shape3 s1 = new Sphere(r);
                System.out.println("Volume: " + s1.volume());
                System.out.println("Surface Area: " + s1.surfacearea());
                break;
            case 2:
                System.out.print("Cube calculation ");
                System.out.print("length: ");
                double lcu = scanner.nextDouble();
                shape3 cube1 = new Cube(lcu);
                System.out.println("Volume: " + cube1.volume());
                System.out.println("Surface Area: " + cube1.surfacearea());
                break;
            case 3:
                System.out.print("Cuboid calculation ");
                System.out.print("length: ");
                double lc = scanner.nextDouble();
                System.out.print("Breadth: ");
                double bc = scanner.nextDouble();
                System.out.print("Height: ");
                double hc = scanner.nextDouble();
                shape3 cuboid1 = new Cuboid(lc,bc,hc);
                System.out.println("Volume: " + cuboid1.volume());
                System.out.println("Surface Area: " + cuboid1.surfacearea());
                break;
            case 4:
                System.out.print("Cone calculation ");
                System.out.print("Radius: ");
                double rco = scanner.nextDouble();
                System.out.print("Height: ");
                double hco = scanner.nextDouble();
                System.out.print("Slant Height: ");
                double lco = scanner.nextDouble();
                shape3 cone1 = new Cone(rco,hco,lco);
                System.out.println("Volume: " + cone1.volume());
                System.out.println("Surface Area: " + cone1.surfacearea());
                break;
            case 5:
                System.out.print("Cylinder calculation ");
                System.out.print("Radius: ");
                double rcy = scanner.nextDouble();
                System.out.print("Height: ");
                double hcy = scanner.nextDouble();
                shape3 cy1 = new Cylinder(rcy,hcy);
                System.out.println("Volume: " + cy1.volume());
                System.out.println("Surface Area: " + cy1.surfacearea());
                break;
            default:
                System.out.println("Invalid Option ");
        }
    }
}
