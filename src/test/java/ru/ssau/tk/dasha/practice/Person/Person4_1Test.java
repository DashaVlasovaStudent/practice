package ru.ssau.tk.dasha.practice.Person;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Person4_1Test {

    @Test
    public void testGetObjectPerson() {
        Person firstPerson = new Person();
        firstPerson.setNames("Ivan", "Ivanov");
        assertEquals(Person4_1.getObjectPerson(firstPerson), "Ivan Ivanov");
        Person secondPerson = new Person();
        secondPerson.setNames(null, null);
        Assert.assertThrows(NullPointerException.class, () -> Person4_1.getObjectPerson(secondPerson));
    }
}