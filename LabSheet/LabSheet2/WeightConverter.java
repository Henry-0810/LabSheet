package LabSheet1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WeightConverter {
    private JFrame mainFrame;
    private JFrame frame;
    private JPanel control1;
    private JTextField weightUserInput;

    public String getWeightUserInput() {
        return weightUserInput.getText();
    }

    public double pToKgConversion(double a) {
        return 0.453592 * a;
    }

    public WeightConverter() {
        prepareGUI();
    }

    public static void main(String[] args) {
        WeightConverter weightConverter = new WeightConverter();
        weightConverter.showNextStep();
    }

    private void prepareGUI() {
        //framework
        mainFrame.setTitle("Weight Converter");
        mainFrame.setSize(300, 100);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        weightUserInput.setColumns(5);
        JLabel pounds = new JLabel("Pounds: " + getWeightUserInput(), JLabel.CENTER);

        control1 = new JPanel();
        control1.setLayout(new FlowLayout());

        mainFrame.add(control1);
        mainFrame.add(pounds);
        mainFrame.setVisible(true);
        String output = "You must enter a value into the textfield";
        if (getWeightUserInput() == null) {
            JOptionPane.showMessageDialog(null, output, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showNextStep() {
        //framework 2
        frame.setTitle("Weight Converter");
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());

        double x = Double.parseDouble(getWeightUserInput());
        JLabel conversion = new JLabel("Pounds: " + getWeightUserInput() + "This is equivalent to "
                + pToKgConversion(Double.parseDouble(String.format("%.2f", x))), JLabel.CENTER);

        frame.add(conversion);
        frame.setVisible(true);
    }
}


