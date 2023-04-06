package tddtest;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

   // @Test(expected = RuntimeException.class)
   // public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
    //    StringCalculator.add("1,2,3");
    //}

    @Test
    public final void whenAnyAmountOfNumbersThenReturnsValuesAreTheirSum() {
        Assert.assertEquals(45+8+9+12+45+33, StringCalculator.add("45,8,9,12,45,33"));
    }

    @Test()
    public final void whenTwoNumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("56,99");
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionThrown() {
        StringCalculator.add(("44, g"));
    }

    @Test
    public final void whenEmptyStringIsUsedReturnValueIsZero() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsThereSum() {
        Assert.assertEquals(12, StringCalculator.add("7,5"));
    }



}
