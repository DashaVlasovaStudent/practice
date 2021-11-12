package ru.ssau.tk.dasha.practice.Person;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.*;



public class PersonSerialazableTest {

    @Test
    public void testSet() throws IOException {
        Person obj = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> PersonSerialazable.set(new ObjectOutputStream(new FileOutputStream(fileName)), obj));
        Assert.assertThrows(ClassCastException.class, () -> PersonSerialazable.set(new ByteArrayOutputStream(), obj));
    }
}