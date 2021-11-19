package ru.ssau.tk.dasha.practice.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {


    Location location = new Location();
    Location location1 = new Location();
    Location location2 = new Location();

    @Test
    public void testAddLocationAtTheEnd() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();
        route.addLocationAtTheEnd(location);
        locations.add(location);
        Assert.assertEquals(route.getLocation(), locations);
    }

    @Test
    public void testAddLocationAtCurrentIndex() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        route.addLocationAtCurrentIndex(0, location);
        locations.add(location);
        Assert.assertEquals(route.getLocation(), locations);

        route.addLocationAtCurrentIndex(1, location1);
        locations.add(location1);
        Assert.assertEquals(route.getLocation(), locations);

        route.addLocationAtCurrentIndex(2, location2);
        locations.add(location2);
        Assert.assertEquals(route.getLocation(), locations);
    }

    @Test
    public void testRemoveLocationAtIndex() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        route.addLocationAtCurrentIndex(0, location);
        locations.add(location);
        route.addLocationAtCurrentIndex(1, location1);
        locations.add(location1);
        route.addLocationAtCurrentIndex(2, location2);
        locations.add(location2);

        locations.remove(1);
        route.removeLocationAtIndex(1);

        Assert.assertEquals(route.getLocation(), locations);

    }
}