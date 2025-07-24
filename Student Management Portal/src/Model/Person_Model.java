package Model;

public class Person_Model {
    public String name;
    public int age;


    public Person_Model (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println ("Name: " + name);
        System.out.println ("Age: " + age);
    }

}
