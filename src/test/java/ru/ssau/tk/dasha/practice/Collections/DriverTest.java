package ru.ssau.tk.dasha.practice.Collections;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

public class DriverTest {

    @Test
    public void testTestEqualsAndToString() {
        Driver driver1 = new Driver();
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("Benedict Camberbetch");
        driver.setGender(Driver.Gender.MALE);
        driver.setLicenceExpirationDate(new Date(12344143L));
        driver.toString();

        driver1.setId(1);
        driver1.setName("Hermaone Greinger");
        driver1.setGender(Driver.Gender.FEMALE);
        driver1.setLicenceExpirationDate(new Date(8379187309L));
        driver1.toString();

        System.out.println(driver);
        System.out.println(driver1);

        assertNotEquals(driver, driver1);

    }
}

