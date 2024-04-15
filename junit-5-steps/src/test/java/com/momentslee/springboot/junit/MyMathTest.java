package com.momentslee.springboot.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTest {

    private final MyMath myMath = new MyMath();

    @Test
    public void calculateSum_basic() {
        int[] numbers = {1, 2, 3};
        int result = myMath.calculateSum(numbers);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void calculateSum_empty() {
        int[] numbers = {};
        int result = myMath.calculateSum(numbers);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void calculateSum_oneValue() {
        int[] numbers = {5};
        int result = myMath.calculateSum(numbers);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void calculateSum_includesNegative() {
        int[] numbers = {-1, 2, 3};
        int result = myMath.calculateSum(numbers);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void calculateSum_null() {
        assertThrows(NullPointerException.class, () -> {
            myMath.calculateSum(null);
        });
    }
}
