package LabSheet4.exercise3;

import javax.swing.*;

public class TestBook {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Davinci Code",19.99,"3452617232",348);

        String output = "Calling the no-argument Book constructor. The first Book object details are: \n\n"+
                book1 + "\n\nCalling the no-argument Book constructor. The second Book object details are: \n\n"+
                book2;

        JOptionPane.showMessageDialog(null,output,"Book Object Data",1);
    }
}
