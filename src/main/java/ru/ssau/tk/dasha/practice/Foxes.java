package ru.ssau.tk.dasha.practice;

public class Foxes extends Animal{
    protected String livePlace;

    public void setLivePlace(String livePlace){
        this.livePlace = livePlace;
    }

    public String getLivePlace(){
        return livePlace;
    }

    public static void main(String[] args) {
        Foxes fox = new Foxes();
        fox.setLivePlace("Syberia");
        System.out.println(fox.getLivePlace());


    }
}
