package ru.ssau.tk.dasha.practice.Collections;

public class Location {
    public Location(){

    }
    private String id;
    private double latitude;
    private double longitude;

    enum SettlementType{
        CITY,
        VILLAGE
    }
    enum WaypointType{
        DEPOT,
        WAREHOUS,
        EMPTY
    }
}
