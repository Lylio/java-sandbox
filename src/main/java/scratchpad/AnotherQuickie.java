package scratchpad;

public class AnotherQuickie {

    public static void main(String[] args) {

        double total = 0.0;

        FannyAround fa = new FannyAround();
        System.out.println(fa.greeting);

        System.out.println(fa.finalTotal);


    }

    public static class FannyAround {
        String greeting = "Hallo YO!";
        private final int num1 = 6;
        private final int num2 = 3;

         int finalTotal = (num1 + num2);

        public double getTotal() {
            return finalTotal;
        }
    }

}
