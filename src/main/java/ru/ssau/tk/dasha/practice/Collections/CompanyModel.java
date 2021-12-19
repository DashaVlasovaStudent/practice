package ru.ssau.tk.dasha.practice.Collections;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

public class CompanyModel {
    Collection<Location> allLocations;
    Collection<Route> Routes;
    Collection<Driver> Drivers;
    private int maxId;

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        Drivers = new LinkedHashSet<>();
        Routes = new LinkedHashSet<>();
    }

    public Collection<Location> getAllLocations() {
        return allLocations;
    }

    public Collection<Driver> getAllDrivers() {
        return Drivers;
    }

    public Collection<Route> getAllRoutes() {
        return Routes;
    }

    public Settlement addSettlement (String name, double latitude,double longtitude,  Location.SettlementType type, int population){
        Settlement settlement = new Settlement();
        settlement.setName(name);
        settlement.setLatitude(latitude);
        settlement.setLongitude(longtitude);
        settlement.setType(type);
        settlement.setSettlement(population);
        settlement.setId(++maxId);
        allLocations.add(settlement);
        return settlement;
    }

    public Waypoint addWaypoint (String name, double latitude,double longtitude,  Location.WaypointType type, Settlement settlement){
        Waypoint waypoint = new Waypoint();
        waypoint.setName(name);
        waypoint.setLatitude(latitude);
        waypoint.setLongitude(longtitude);
        waypoint.setType(type);
        waypoint.setSettlement(settlement);
        waypoint.setId(++maxId);
        allLocations.add(waypoint);
        return waypoint;
    }

    public Driver addDriver (String name, Driver.Gender gender, Date licenseExpirationDate){
        Driver driver = new Driver();
        driver.setName(name);
        driver.setGender(gender);
        driver.setLicenceExpirationDate(licenseExpirationDate);
        driver.setId(++maxId);
        return driver;
    }

    public  Route addRoute (List<Location> locations){
        Route route = new Route();
        for (Location location: locations){
            route.addLocationAtTheEnd(location);
        }
        return route;
    }

}
