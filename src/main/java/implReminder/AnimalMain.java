package implReminder;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();
        animal.eat();

        animal = new Pig();
        animal.makeSound();
        animal.eat();


    }
}
