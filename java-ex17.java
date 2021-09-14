/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender= myObj.nextInt();

        if (gender == 1) {
            System.out.println("How many ounces of alcohol did you have?");
            int alcohol = myObj.nextInt();

            System.out.println("what is your weight in pounds? ");
            int weight = myObj.nextInt();

            System.out.println("how many hours has it been since your last drink? ");
            int hours = myObj.nextInt();

            
            double BAC = (alcohol * 5.14 / weight * 0.73) - (0.015 * hours);

            System.out.println("Your BAC is " + BAC);

            if(BAC >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.print("It is legal for you to drive.");
            }

            
        } else {
            System.out.println("How many ounces of alcohol did you have?");
            int alcohol = myObj.nextInt();

            System.out.println("what is your weight in pounds? ");
            int weight = myObj.nextInt();

            System.out.println("how many hours has it been since your last drink? ");
            int hours = myObj.nextInt();

            
            double BAC = (alcohol * 5.14 / weight * 0.66) - (0.015 * hours);

            System.out.println("Your BAC is " + BAC);

            if(BAC >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.print("It is legal for you to drive.");
            }

        }
        
        myObj.close();
    }
}