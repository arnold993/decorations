package com.softwareinstitute.training.arnold.quarcoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner height = new Scanner(System.in);
        System.out.println("Please enter the height of the wall");
        float wallHeight = height.nextFloat();

        Scanner width = new Scanner(System.in);
        System.out.println("Please enter the width of the wall");
        float wallWidth = width.nextFloat();
        float roomArea = wallWidth*wallHeight;

        System.out.println("Your room area is " + wallHeight + " x " + wallWidth);
        System.out.println("The total area of the room is " + roomArea);
        // ADDITIONAL CODE NEEDED TO CALCULATE COST

        // ASSUMPTIONS
        System.out.println("For the total area of " + roomArea + " you will need 2.5L of paint");
        System.out.println("The total cost is £22.50");


    }
}
