/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;
import java.time.Year;

public class Main {

    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age? ");
        int age= input.nextInt();

        System.out.println("At what age would you like to retire?");
        int retire= input.nextInt();

        int difference= retire-age;
        System.out.printf("You have %d years left until you can retire. %n", difference );

        int year = Year.now().getValue();
        int years= year+difference;
        System.out.printf("It's %d, so you can retire in %d.", year,years);

    }
}
