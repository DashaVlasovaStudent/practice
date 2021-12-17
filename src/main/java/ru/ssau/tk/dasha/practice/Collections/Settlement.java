package ru.ssau.tk.dasha.practice.Collections;

public class Settlement extends Location {
    public Settlement() {

    }

    private int settlement;
    private SettlementType type;


    public SettlementType getType() {
        return type;
    }

    public int getSettlement() {
        return settlement;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }


    @Override
    public String toString() {
        return "The type of settlement " + getType() + "\nName: " + getName() + "\n Longtitude: " + getLongitude() + "\n Latitude" + getLatitude();
    }


}