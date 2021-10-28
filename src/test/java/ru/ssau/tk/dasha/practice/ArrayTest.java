package ru.ssau.tk.dasha.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testNewArray() {
        int[] array1 = new int[5];
        Array array2 = new Array();

        assertEquals( array2.newArray(5).length, array1.length);
    }


}