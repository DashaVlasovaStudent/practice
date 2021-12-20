package ru.ssau.tk.dasha.practice.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


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

    @Test
    public void testIterator() {
        Route route = new Route();
        int i = 0;

        route.addLocationAtCurrentIndex(0, location);
        route.addLocationAtCurrentIndex(1, location1);
        route.addLocationAtCurrentIndex(2, location2);

        location.setId(0);
        location1.setId(1);
        location2.setId(2);

        for (Location locations : route) {
            Assert.assertEquals(locations.getId(), i++);
        }
    }

    @Test
    public void testRemove() {
        List<Location> locations = new ArrayList<>();

        locations.add(location);
        locations.add(location1);
        locations.add(location2);
        Assert.assertEquals(location1, locations.get(1));

        locations.remove(1);
        Assert.assertEquals(location2, locations.get(1));


    }

    @Test
    public void testToString() {
        Settlement settlement = new Settlement();
        settlement.setType(Location.SettlementType.VILLAGE);
        settlement.setName("Lublino");
        settlement.setLatitude(34);
        settlement.setLongitude(99);
        settlement.toString();

        Waypoint waypoint = new Waypoint();
        waypoint.setType(Location.WaypointType.DEPOT);
        waypoint.setName("some depot");
        waypoint.setLatitude(44);
        waypoint.setLongitude(22);
        waypoint.toString();

        System.out.println(settlement);
        System.out.println(waypoint);
    }

    @Test
    public void testCompareTo(){
        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();

        Settlement city = new Settlement();
        Waypoint depot = new Waypoint();

        city.setLongitude(3);
        city.setLatitude(5);

        depot.setLongitude(4);
        depot.setLatitude(2);

        route1.addLocationAtTheEnd(city);
        route2.addLocationAtTheEnd(city);
        route3.addLocationAtTheEnd(city);
        route3.addLocationAtTheEnd(depot);

        Assert.assertEquals(route1.length(), route2.length());
    }
}