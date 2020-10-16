package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestMain {
    @Test
    public void findNumbersTest() {
        String expected = "23 5 5 631 6 11 ";
        String example = "Hello23 world5.5 J631ava6, gre11at!";
        List<Integer> name = Main.getNumbers(example);
        String  line1 = "";
        for (int i = 0; i < name.size(); ++i) {
            line1 += name.get(i) + " ";
        }
        Assertions.assertEquals(line1, expected);


    }


}
