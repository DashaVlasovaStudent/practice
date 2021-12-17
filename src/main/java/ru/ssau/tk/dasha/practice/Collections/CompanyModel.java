package ru.ssau.tk.dasha.practice.Collections;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CompanyModel {
    Collection<Location> allLocations;
    Collection<Route> Routes;
    Collection<Driver> Drivers;

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
}
