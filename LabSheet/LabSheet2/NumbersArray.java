package LabSheet1;

import java.util.Arrays;

public class NumbersArray {
    static double[] arrNum = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};
    public static void main(String[] args) {
        System.out.println(largest(arrNum));
        System.out.println(String.format("%.3f",average(arrNum)));
        aboveAverage();
        

    }

    private static void aboveAverage() {

    }

    private static double average(double[] num) {
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
