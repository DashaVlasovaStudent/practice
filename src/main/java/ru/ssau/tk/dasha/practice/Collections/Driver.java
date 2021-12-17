package ru.ssau.tk.dasha.practice.Collections;

import java.util.Date;
import java.util.Objects;

public class Driver {
    private int id;
    private String name;
    private Date licenceExpirationDate;
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE,
        OTHER
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setLicenceExpirationDate(Date licenceExpirationDate){
        this.licenceExpirationDate = licenceExpirationDate;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }
    public Date getLicenceExpirationDate(){
        return licenceExpirationDate;
    }

    @Override
    public boolean equals( Object obj){
        return this == obj;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, gender, licenceExpirationDate);
    }

    @Override
    public String toString(){
        return "Driver:\n"+"Id: "+id +"\n Name: "+name+"\n Gender"+gender+"\n LicenceExpirationDate "+ licenceExpirationDate;
    }

}
