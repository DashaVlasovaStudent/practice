package ru.ssau.tk.dasha.practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Route implements Iterable<Location> {
    @Override
    public Iterator<Location> iterator() {
        return locations.iterator();
    }

    public List<Location> locations = new ArrayList<>();

    public List<Location> getLocation() {
        return locations;
    }

    public void addLocationAtTheEnd(Location location) {
        this.locations.add(location);
    }

    public void addLocationAtCurrentIndex(int i, Location location) {
        this.locations.add(i, location);
    }

    public void removeLocationAtIndex(int i) {
        this.locations.remove(i);
    }

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }


}
