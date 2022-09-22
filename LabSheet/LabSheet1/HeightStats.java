package LabSheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        double h;
        double[] hArr = new double[6];

        while(x < 6){
            System.out.println("Loop "+(x+1)+"- Please enter height: ");
            h = input.nextDouble();
            while(h > 2.72 || h < 0.5464){
                System.out.println("Loop "+(x+1)+"- Height value invalid!!! Please re-enter height: ");
                h = input.nextDouble();
            }
            hArr[x] = h;
            x++;
        }

        System.out.println("-------------------------------");
        System.out.println("       Height Statistics       ");
        System.out.println("-------------------------------");

        //average height
        double avgH = (hArr[0]+hArr[1]+hArr[2]+hArr[3]+hArr[4]+hArr[5])/6;

        //finding min height
        int i;
        double minH = hArr[0];
        for(i=0;i<hArr.length;i++){
            if(hArr[i] < minH){
                minH = hArr[i];
            }
        }

    }
}
