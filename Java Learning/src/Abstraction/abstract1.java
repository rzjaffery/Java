package Abstraction;

abstract class animal{
    abstract void sound();

}
class tiger extends animal{
    void sound(){
        System.out.println("Tiger is making the sound");
    }
}
class lion extends animal{
    void sound(){
        System.out.println("Lion is making the sound");
    }
}
public class abstract1 {

    public static void main(String[] args) {
        animal tiger = new tiger();
        animal lion = new lion();

        tiger.sound();
        lion.sound();
    }
}
