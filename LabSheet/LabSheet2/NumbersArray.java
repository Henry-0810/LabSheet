package LabSheet1;

import javax.swing.*;
import java.util.Arrays;

public class NumbersArray {
    static double[] arrNum = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};
    public static void main(String[] args) {
        String output = "The largest value in the array is " + largest(arrNum) +"\n\n" +
                "The average value in the array is " + String.format("%.3f",average(arrNum)) + "\n\n" +
                "The list of values above the average is: " + aboveAverage(arrNum);

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

    private static String aboveAverage(double[] num) {
        String listAboveAvg = "";
        for(int i=0;i< arrNum.length;i++){
            if(arrNum[i] >= average(arrNum)){
                listAboveAvg += num[i] + " ";
            }
        }
        return listAboveAvg;

    }

    public static double average(double[] num) {
/*
        double avg = num[0];
        for (double digits : arrNum) {
            avg += digits;
        }
        double avgNum = avg/8;
        return avg;
*/
        return Arrays.stream(num).average().orElse(0);
    }

    private static double largest(double[] num) {
/*        double maxNum = num[0];
        for (double digits:arrNum){
            if(digits > maxNum) maxNum = digits;
        }
        return maxNum;*/
        return Arrays.stream(num).max().orElse(0);
    }
}
