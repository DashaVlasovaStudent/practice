package ru.ssau.tk.dasha.practice.Collections;

public class Waypoint extends Location{
    public Waypoint(){

    }
    private WaypointType type ;
    private Settlement settlement;

    public WaypointType getType() {
        return type;
    }
    public Settlement getSettlement(){
        return settlement;
    }
    public void setType(WaypointType type){
        this.type=type;
    }
    public void setSettlement(Settlement settlement){
        this.settlement=settlement;
    }


    @Override
    public String toString() {
        return "The type of settlement " + getType() + "\nName: " + getName() + "\n Longtitude: " + getLongitude() + "\n Latitude" + getLatitude();
    }

}
