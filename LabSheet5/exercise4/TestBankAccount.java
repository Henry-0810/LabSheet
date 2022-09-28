package LabSheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount("Richy Rich",2342343,0.75);
        String output = "Calling the no-argument BankAccount constructor. The first BankAccount object details are: \n\n" +
                bank1 + "\n\nCalling the multi-argument BankAccount constructor. The seocnd BankAccount object" +
                " details are:\n\n" + bank2;

        BankAccount.setInterestRate(0.5);
        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5.\n\n" +
                "The first BankAccount details are:\n\n" + bank1 + "\n\nThe seocnd BankAccount object details are:\n\n" +
                bank2;

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",1);
        System.exit(0);
    }
}
