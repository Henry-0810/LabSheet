package LabSheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        String output2;
        int newTemp;
        Thermometer ther1 = new Thermometer(35);
        Thermometer ther2 = new Thermometer();
        String output = "*****Thermometer Testing*****\n\n" + "Calling the single-argument constructor......setting the"
                + " temperature of the first thermometer to 35C\nFirst Thermometer:\n" + ther1 +
                "\nCalling the no-argument constructor......setting the temperature of the second thermometer to 0C" +
                "\nSecond Thermometer: \n" + ther2;

        ther2.setTemperature(25);
        output += "\nCalling setTemperature()......setting the temperature of the second thermometer to 25C\n" +
                "Second Thermometer: \n" + ther2;

        JOptionPane.showMessageDialog(null,output,"",1);

        newTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:"));

        ther1.setTemperature(newTemp);
        output2 = "*****Thermometer Testing*****\n\n" + "Calling setTemperature()......setting the"
                + " temperature of the first thermometer to " + newTemp + "C\nFirst Thermometer:\n" + ther1;


        JOptionPane.showMessageDialog(null,output2,"",1);
    }
}
