package ru.ssau.tk.dasha.practice.Person;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.dasha.practice.Auto;

import static org.testng.Assert.*;

public class Exceptions4_2Test {
    @Test
    public void testSet() {
        String[] str = {"Shine", "bright", "like", "a", "diamond"};
        assertEquals(Auto.Exceptions4_2.getSymbol(str, 0), new String[]{"S", "b", "l", "a", "d"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Auto.Exceptions4_2.getSymbol(str, 3));
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Auto.Exceptions4_2.getSymbol(str, -5));

        Assert.assertThrows(NullPointerException.class,
                () -> Auto.Exceptions4_2.getSymbol(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Auto.Exceptions4_2.getSymbol(str1, 0));
    }

}