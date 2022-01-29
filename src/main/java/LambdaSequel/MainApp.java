package LambdaSequel;

public class MainApp {

    public static void main(String[] args) {

        Ex1 message = () -> "This is the message";

        System.out.println(message.Greeting());

        Ex2 digit = () -> {
            return 7;
        };

        System.out.println(digit.Value());
    }
}

interface Ex1 {
     public String Greeting();
}

interface Ex2 {
    public int Value();
}

