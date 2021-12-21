package ru.ssau.tk.dasha.practice.Collections;


import java.util.Comparator;

public class EquatorComparator implements Comparator<Location> {
    @Override
    public int compare(Location location, Location locationOther){
        return Double.compare(location.getLatitude(), locationOther.getLatitude());
    }
}
