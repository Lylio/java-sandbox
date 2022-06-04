package lambda;

public class Main {
    public static void main(String[] args) {

        MyInterface myInterface = () -> System.out.printf("DOOOODLE");

        myInterface.message();

        MySecondInterface mySecondInterface = () -> 5 + 7;
        System.out.println(mySecondInterface.number());
    }
}

