package ru.ssau.tk.dasha.practice.Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RouteLengthComparator implements Comparator<Route> {
    Map<Route, Double> routeDoubleMap = new HashMap<>();

    @Override
    public int compare(Route route1, Route route2){
        return Double.compare(routeDoubleMap.get(route1), routeDoubleMap.get(route2));
    }
}
