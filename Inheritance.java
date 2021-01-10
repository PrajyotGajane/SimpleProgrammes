class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Barks...");
    }
}

class Lion extends Animal{
    public void sound() {
        System.out.println("Roars...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Lion lion = new Lion();
        System.out.println("Class Dog using inherited methods of super class Animals");
        dog.eat();
        dog.sound();
        dog.sleep();

        System.out.println("Class Lion using inherited methods of super class Animals");
        lion.eat();
        lion.sound();
        lion.sleep();
    }
}
