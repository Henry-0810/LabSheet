package LabSheet1;

import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);//Programming in Java is an education
        String input;

        System.out.println("Please enter piece of text: "); //enter
        input = lines.nextLine();
        int i = 0, y = 0;
        int lowers = 0; //lowercase number
        char[] c = input.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        while (i < input.length()) { //no. of lowercase and vowels
            char ch = input.charAt(i);
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u')) {
                lowers++;
            }
            i++;
        }
        int j = 0;
        String[] words = new String[0];
        while (j < input.length()) { //no. of words in a string
            words = input.split("\\s+");
            j++;
        }
        int k = 0;
        int seq = 0;
        while(k < input.length()){
            if(input.charAt(k) == 'e' && input.charAt(k+1) == 'd'){
                seq++;
            }
            k++;
        }
        System.out.println("******Text Data******");
        System.out.println("Number of characters: " + input.length()); //no. of char
        System.out.println("Number of lowercase vowels: " + lowers);//no.of lowers vowels
        System.out.println("Number of words: " + words.length); //no. of words
        System.out.println("Numbers of times \"ed\" appears in the text: " + seq);//no. of "ed" appear
    }
}

