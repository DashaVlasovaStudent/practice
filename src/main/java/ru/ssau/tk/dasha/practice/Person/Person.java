package ru.ssau.tk.dasha.practice.Person;



class Person{
    private String firstName;
    private String lastName;
    private int passportld;


    public Person (){
    }


    public void setInformation (String firstName, String lastName, int passportld){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportld = passportld;
    }
    public void setNames (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getInformation() {
        System.out.println("Имя: " + firstName + ", фамилия: " + lastName + ", номер паспорта: " + passportld );
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setInformation("Ivan", "Ivanov", 227799);
        person1.getInformation();
        person2.setInformation("Petr", "Petrov", 283056);
        person2.getInformation();
        person3.setInformation("Konstantyn", "Viktorov", 936502);
        person3.getInformation();
    }
    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

}
