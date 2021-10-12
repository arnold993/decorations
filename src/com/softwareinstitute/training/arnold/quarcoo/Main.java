package com.softwareinstitute.training.arnold.quarcoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner height = new Scanner(System.in);
        System.out.println("Please enter the height of the wall (in metres)");
        float wallHeight = height.nextFloat();

        Scanner width = new Scanner(System.in);
        System.out.println("Please enter the width of the wall (in metres)");
        float wallWidth = width.nextFloat();
        float roomArea = wallWidth*wallHeight;

        System.out.println("Your room size is " + wallHeight + " x " + wallWidth);
        System.out.println("The total area of the room is " + roomArea + "square metres");


        // IF STATEMENT TO CALCULATE HOW MUCH PAINT
        if (roomArea > 15.7)
        {
            System.out.println("You will need you will need 5.5L of paint for " + roomArea);
        }
        else
        {
            System.out.println("You will need you will need 3.5L of paint for " + roomArea);
        }

        float bigRoom = 25;
        String endResult;
        endResult = roomArea <= 25 ? "Your room does not qualify for premium paint." : "Your room qualifies for premium paint.";
        System.out.println(endResult);

        // USE SWITCH STATEMENTS
        Scanner workingDay = new Scanner(System.in);
        System.out.println("Which day would you like the work to be done: 1- Monday, 2- Tuesday, 3- Wednesday, 4- Thursday, 5- Friday.");
        int day = workingDay.nextInt();

        Scanner workDay = workingDay;
        switch (day)
        {
            case 1:
                System.out.println("Monday, is available");
                break;
            case 2:
                System.out.println("Tuesday, is not available");
                break;
            case 3:
                System.out.println("Wednesday, is available");
                break;
            case 4:
                System.out.println("Thursday, is available");
                break;
            case 5:
                System.out.println("Friday, is available");
                break;
        }

        Scanner decorator = new Scanner(System.in);
        System.out.println("How many hours will decorator need?");
        int decoratorHours = decorator.nextInt();
// ADD OFFER OF ADDITIONAL ROOMS AT AS COST- WHILE LOOP
        // FINISH WHILE LOOP

    }
}
