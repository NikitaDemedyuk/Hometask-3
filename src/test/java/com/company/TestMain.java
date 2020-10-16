package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

    @Test
    public void findNumbersTest() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(23, 5, 5, 631, 6, 11));
        String example = "Hello23 world5.5 J631ava6, gre11at!";
        List<Integer> actual = Main.getNumbers(example);
        Assertions.assertIterableEquals(expected, actual);
    }


}
