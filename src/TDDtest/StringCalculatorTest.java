package TDDtest;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }

    @Test()
    public final void whenTwoNumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("56,99");
        Assert.assertTrue(true);
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
    
}
