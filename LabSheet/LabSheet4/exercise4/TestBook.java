package LabSheet4.exercise4;

import LabSheet4.exercise3.Book;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        //declare variable
        String title;
        double price;
        String ISBN;
        int pages;

        //Favourite book inputs
        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favourite book"));

        Book book1 = new Book(title,price,ISBN,pages);
        //Least favourite book inputs
        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favourite book"));

        Book book2 = new Book(title,price,ISBN,pages);

        String output = "Calling the no-argument Book constructor. The first Book object details are: \n\n"+
                book1 + "\n\nCalling the no-argument Book constructor. The second Book object details are: \n\n"+
                book2;

        JOptionPane.showMessageDialog(null,output,"Book Object Data",1);
    }

}
