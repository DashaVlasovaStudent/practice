package ru.ssau.tk.dasha.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exceptions4_4Test {

    @Test
    public void testGetIntOfString() {

            Exceptions4_4.getIntOfString("100","25");
            Assert.assertThrows(ArithmeticException.class,
                    () ->   Exceptions4_4.getIntOfString("100","0"));
            Assert.assertThrows(NumberFormatException.class,
                    () ->    Exceptions4_4.getIntOfString("x","9"));
            Assert.assertThrows(NumberFormatException.class,
                    () ->    Exceptions4_4.getIntOfString("s","a"));

    }
}