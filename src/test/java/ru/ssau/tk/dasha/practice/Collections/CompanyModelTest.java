package ru.ssau.tk.dasha.practice.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompanyModelTest {

    @Test
    public void testAsssignRoute() {
        CompanyModel companyModel = new CompanyModel();
        Driver driver = new Driver();
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();
        Route route = new Route();
        Route route1 = new Route();
        Route route2 = new Route();
        companyModel.asssignRoute(driver, route);
        companyModel.asssignRoute(driver1, route1);
        companyModel.asssignRoute(driver2, route2);

        Assert.assertEquals(companyModel.getDriverRouteMap().get(driver), route);
        Assert.assertEquals(companyModel.getDriverRouteMap().get(driver1), route1);
        Assert.assertEquals(companyModel.getDriverRouteMap().get(driver2), route2);
    }
}