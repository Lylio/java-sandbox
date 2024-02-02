package MoreUnitTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    @Test
    void testCompareWhenN1IsGreater() {
        Basic basic = new Basic();
        int result = basic.compare(5, 3);
        assertEquals(1, result);
    }

    @Test
    void testCompareWhenN2IsGreater() {
        Basic basic = new Basic();
        int result = basic.compare(2, 9);
        assertEquals(-1, result);
    }

    @Test
    void testCompareWhenN1EqualsN2() {
        Basic basic = new Basic();
        int result = basic.compare(4, 4);
        assertEquals(-1, result);
    }
}