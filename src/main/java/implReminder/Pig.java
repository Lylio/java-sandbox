package implReminder;

public class Pig implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }

    @Override
    public void eat() {
        System.out.println("Yum, good grub!");
    }
}
