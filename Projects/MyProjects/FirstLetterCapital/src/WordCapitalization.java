/*
 * Made by Prathamesh Mutkure
 * Capitalizes the first word of each String sentence
 */


import java.util.Scanner;

public class WordCapitalization {

    private static Scanner mScanner = new Scanner(System.in);

    public static String logic(String inputStr){

        char firstChar = inputStr.charAt(0);
        String firstCapitalChar = (String.valueOf(firstChar)).toUpperCase();

        String withoutFirstChar = inputStr.substring(1);
        String newStr = firstCapitalChar + withoutFirstChar;

        return newStr;

    }

    public static void main(String args[]){

        System.out.println("Enter a Word:");
        System.out.println(logic(mScanner.nextLine()));

    }

}
