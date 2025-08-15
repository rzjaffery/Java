package Abstraction;

abstract class Employee {
    abstract double calSalary();

    abstract void displayInfo();
}

class Manager extends Employee {

    private int hrs;
    private double hourlySalary;

    public Manager(int hrs, double hs) {
        this.hrs = hrs;
        hourlySalary = hs;
    }

    double calSalary(){
        return hrs*hourlySalary;
    }
    void displayInfo(){
        System.out.println("Employee Salary");
        System.out.println("Hours work "+hrs);
        System.out.println("Hourly Wage "+ hourlySalary);
        System.out.println("Salary " +
                "" + calSalary());
    }
}
class Programmer extends Employee {

    private int hrs;
    private double hourlySalary;

    public Programmer(int hrs, double hs) {
        this.hrs = hrs;
        hourlySalary = hs;
    }

    double calSalary(){
        return hrs*hourlySalary;
    }
    void displayInfo(){
        System.out.println("Programmer Salary");
        System.out.println("Hours work "+hrs);
        System.out.println("Hourly Wage "+ hourlySalary);
        System.out.println("Salary " + calSalary());
    }
}


public class abstract3 {
    public static void main(String[] args) {
        Employee m1 = new Manager(48,12);
        Employee p1 = new Programmer(55,10);

        m1.displayInfo();
        p1.displayInfo();

    }
}
