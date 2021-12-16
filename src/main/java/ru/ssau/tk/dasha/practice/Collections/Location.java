package ru.ssau.tk.dasha.practice.Collections;

import java.util.Objects;

public class Location {
    public Location() {

    }

    private int id;
    private double latitude;
    private double longitude;

    enum SettlementType {
        CITY,
        VILLAGE
    }

    enum WaypointType {
        DEPOT,
        WAREHOUS,
        EMPTY
    }

    public void setId(int id){
        this.id = id;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public int getId (){
        return id;
    }
    public double getLatitude (){
        return latitude;
    }
    public double getLongitude (){
        return longitude;
    }

    @Override
    public boolean equals (Object object){
        if (this == object){
            return  true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
