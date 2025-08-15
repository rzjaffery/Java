package Abstraction;

abstract class shape3D{

     abstract double calVol();
     abstract double calSA();
}

class Sphere extends shape3D{
    private double r;
    final double p = Math.PI;

    public Sphere(double rad){
        r = rad;
    }

    double calVol(){
        return ((double) 4 /3)*p*(r*r*r);
    }
    double calSA(){
        return 4*p*(r*r);
    }
}

class Cube extends shape3D{
    private double a;

    public Cube(double a){
        this.a = a;
    }
    double calVol(){
        return Math.pow(a,3);
    }
    double calSA(){
        return 6*(a*a);
    }
}
public class abstract4 {
    public static void main(String[] args) {

        shape3D c1 = new Cube(5);
        shape3D s1 = new Sphere(4);

        System.out.println("Volume of Cube: "+c1.calVol());
        System.out.println("Surface Area of Cube: "+c1.calSA());
        System.out.println("Volume of Sphere: "+s1.calVol());
        System.out.println("Surface Area of Sphere: "+s1.calSA());
    }
}
