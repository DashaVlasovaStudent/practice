package ru.ssau.tk.dasha.practice;

class Mainn{
    public static void main (String[] s){
        Person person1 = new Person();
        person1.setInformation("Ivan", "Ivanov", 227799);
        person1.getInformation();
        person1.setInformation("Petr", "Petrov", 283056);
        person1.getInformation();
        person1.setInformation("Konstantyn", "Viktorov", 936502);
        person1.getInformation();

    }
}

class Person{
    private String firstName;
    private String lastName;
    private int passportld;


    public Person (){
    };


    public void setInformation (String firstName, String lastName, int passportld){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportld = passportld;
    };
    public void getInformation (){
        System.out.println("Имя: " + firstName + ", фамилия: " + lastName + ", номер паспорта: " + passportld );
    };

}


