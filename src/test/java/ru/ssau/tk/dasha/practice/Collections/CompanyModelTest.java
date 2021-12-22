package ru.ssau.tk.dasha.practice.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
    @Test
    public void testSort(){
        Settlement settlement1 = new Settlement();
        Settlement settlement2 = new Settlement();
        Settlement settlement3 = new Settlement();
        Settlement settlement4 = new Settlement();

        settlement1.setId(222);
        settlement2.setId(200);
        settlement3.setId(190);
        settlement4.setId(100);

        settlement1.setLatitude(930);
        settlement2.setLatitude(7373);
        settlement3.setLatitude(72687);
        settlement4.setLatitude(2229);

        List<Settlement> settlements = new ArrayList<>(Arrays.asList(settlement1,settlement2,settlement3,settlement4));
        CompanyModel.sort(settlements, new EquatorComparator());

        CompanyModel.sort(settlements, Comparator.comparingInt(Location::getId));
        Assert.assertEquals(settlements, new ArrayList<>(Arrays.asList(settlement4,settlement3,settlement2,settlement1)));
    }
}