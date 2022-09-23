package LabSheet1;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomArray {
    static int[] num = new int[10];

    public static void main(String[] args) {
        int[] arrNum = populateArray(num);
        int counts = 0;
        int perc;
        int i = 0;
        String output = "The initial contents of the array is " + Arrays.toString(arrNum);


        while(i< arrNum.length) {
            if (arrNum[i] > 100) {
                counts++;
            }
            i++;
        }
        perc = counts*10;
        Arrays.sort(arrNum);
        output += "\n\n" + "The percentage of values that exceed 100 is " + perc + "%" + "\n\n" +
                "The contents of the array after sorting is: " + Arrays.toString(arrNum);

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static int[] populateArray(int[] Num) {
        int i;
        for(i = 0;i< num.length;i++){
            num[i] += Math.round(Math.random()*999 + 1);
        }
        return Num;
    }
}
