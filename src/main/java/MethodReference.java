import javax.xml.transform.OutputKeys;
import java.util.function.Function;

public class MethodReference {

    // Method Reference - the :: double colon operator
    public static class Hey {
        public static double square(double num) {
            return Math.pow(num, 2);
        }
    }

    public static class MyTest {
        public static String greeting(String msg) {
            System.out.println("Message: " + msg);
            return "Message: " + msg;
        }
    }

    public static void main(String[] args) {
        Function<Double, Double> square = Hey::square;
        double ans = square.apply(13.4);
        System.out.println(ans);

        Function<String, String> salutation = MyTest::greeting;
        String ans2 = salutation.apply("bananas");
    }
}


