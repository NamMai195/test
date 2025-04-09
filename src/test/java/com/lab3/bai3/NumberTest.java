package com.lab3.bai3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NumberTest {

    private int number;
    private boolean expectedResult;

    public NumberTest(int number, boolean expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][] {
            { 1, true },
            { 2, true },
            { 3, true },
            { 100, true },
            { -1, false },
            { -2, false },
            { -3, false },
            { -100, false },
            { 0, false }
        });
    }

    @Test
    public void testIsPositiveNumber() {
        assertEquals(expectedResult, NumberUtils.isPositive(number));
    }
}

class NumberUtils {
    public static boolean isPositive(int number) {
        return number > 0;
    }
}