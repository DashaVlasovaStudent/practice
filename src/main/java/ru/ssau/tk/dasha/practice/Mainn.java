package ru.ssau.tk.dasha.practice;

public class Mainn {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 227799);
        Person person2 = new Person("Petr", "Petrov");
        Person person3 = new Person(936502);
        Person person4 = new Person();

        person1.getInformation();
        person2.getInformation();
        person3.getInformation();
        person4.getInformation();
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int passportld;


    public Person (){
        this.firstName = "David";
        this.lastName = "Damiano";
        this.passportld = 848020;
    }

    public Person (String firstName, String lastName){
        this.firstName =firstName;
        this.lastName = lastName;
    }

    public Person ( int passportld){

        this.passportld = passportld;
    }

    public Person (String firstName, String lastName, int passportld){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportld = passportld;
    }

    public void getInformation() {
        System.out.println("Имя: " + firstName + ", фамилия: " + lastName + ", номер паспорта: " + passportld );
    }//так как выводятся сразу три параметра, то незаполненные из них будут выводиться как null, если это имя
    //или фамилия(String), и 0, если номер паспорта(int)
}


