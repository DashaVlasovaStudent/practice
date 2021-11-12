package ru.ssau.tk.dasha.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exceptions4_3Test {

    @Test
    public void Exceptions4_3Test() {
        String[] arrayStr = new String[]{"Shine", "bright", "like", "a", "diamond"};

        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Exceptions4_3.getCertainSymbol(arrayStr, 20, 0));
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exceptions4_3.getCertainSymbol(arrayStr, 0, 20));
        Assert.assertEquals(Exceptions4_3.getCertainSymbol(arrayStr,0,0), 'S');
    }
}