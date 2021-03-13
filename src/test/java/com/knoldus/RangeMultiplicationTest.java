package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RangeMultiplicationTest {
    @Test
    public void multiplyInRangeTest()throws Exception {
        Assertions.assertEquals(0, RangeMultiplication.multiply("0","1"));
    }

    @Test
    public void multiplyInRangeForEqualValues()throws Exception {
        Assertions.assertEquals(20, RangeMultiplication.multiply("20", "20"));
    }

    @Test
    public void multiplyInRangeForUnequalValues()throws Exception {
        Long expectedValue = 54486432000L;
        Assertions.assertEquals(expectedValue, RangeMultiplication.multiply("5", "15"));
    }

    @Test
    public void multiplyInRangeForNegativeValues()throws Exception {
        Assertions.assertEquals(120, RangeMultiplication.multiply("-5", "-2"));
    }

    @Test
    public void TestForfirstNumGreater()throws Exception {
        Assertions.assertThrows(Exception.class, ()-> RangeMultiplication.multiply("4","3"));
    }

    @Test
    public void TestForWrongInputType()throws Exception {
        Assertions.assertThrows(NumberFormatException.class, ()-> RangeMultiplication.multiply("two","3"));
    }
}