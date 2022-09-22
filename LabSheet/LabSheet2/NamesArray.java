package LabSheet1;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    static String[] names = new String[5];
    public static void main(String[] args) {
        populateArray();
        int maxLength = 0;
        int charCount = 0;
        String longestStr = null;
        //finding longest string
        for (String str:names) {
            if(str.length()>maxLength) {
                maxLength = str.length();
                longestStr = str;
            }
            //no. of char in a String
            String strNoSpace = str.replaceAll("\\s", "");
            for(int j=0;j<strNoSpace.length();j++){
                charCount++;
            }
        }
        double charCount2 = charCount;
        int avgChar = Math.toIntExact(Math.round(charCount2 / 6)); //average char in a string
        Arrays.sort(names); //sort
        JOptionPane.showMessageDialog(null,"The longest name is "+longestStr+
                "\n\nAverage characters per name is "+avgChar+"\n\nThe array sorted in ascending order is:\n\n "+
                Arrays.toString(names),"Results",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void populateArray() {
        int i = 0;
        while(i<5){
            names[i] = JOptionPane.showInputDialog("Please enter the name of the person " + (i+1));
            i++;
        }
    }
}
