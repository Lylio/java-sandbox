package decimalround;

// How to round a number to N decimal places

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalRound {

    public static void main(String[] args) {

        double myDecimal = 12.65746654;

        // Rounded output with print format
        System.out.printf("Print format version: %.2f", myDecimal); //5.655


        // Manipulate the value with the DecimalFormat class
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("\nUsing DecimalFormat.class: " + df.format(myDecimal));

        // Use a helper method
        System.out.println("\nHelper method version: " + round(myDecimal,4));

    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

