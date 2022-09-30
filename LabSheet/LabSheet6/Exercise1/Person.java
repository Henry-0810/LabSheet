package LabSheet6.Exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        setName("Not Supplied","Not Supplied");
    }

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String toString() {
        return "First name: " + getFirstName() + "   Last Name: " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
