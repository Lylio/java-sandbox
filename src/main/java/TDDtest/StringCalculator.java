package TDDtest;

public class StringCalculator {

    public static int add(final String numbers) {

        int returnValue = 0;

        String[] numbersArray = numbers.split(",");

        //if (numbersArray.length > 2) {
         //   throw new RuntimeException("Up to 2 number, separated by a comma (,) are allowed");
       // }

        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number);
            }
        }

        return returnValue;
    }
}


