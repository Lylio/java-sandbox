package TDDtest;

public class StringCalculator {

    public static int add(String numbers) {

        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 number, separated by a comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!numbers.isEmpty()) {
                    Integer.parseInt(number);
                    if (numbersArray.length == 1) {
                        return Integer.parseInt(numbersArray[0]);
                    }
                }
            }
            return 0;
        }
    }
}


