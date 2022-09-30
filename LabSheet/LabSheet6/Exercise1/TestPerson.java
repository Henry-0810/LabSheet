package LabSheet6.Exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        String inputFname = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String inputLname = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person person1 = new Person();
        Person person2 = new Person(inputFname,inputLname);

        String output = "*****Person Class Tester*****\n\nCalling the Person() constructor ......\n"+
                "Value of the first Person object is: " + person1 +"\n\nCalling the Person(String, String) constructor "+
                "after getting user-supplied values......\nValue of the second Person object is: " + person2;

        JOptionPane.showMessageDialog(null,output,"",1);
        System.exit(0);
    }
}
