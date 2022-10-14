package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pointsEarned;
        int pointsTotal;
        double score;
        Scanner input = new Scanner(System.in);

        // Test out your Divide() function!
        System.out.println("Please enter the total number of earned points: ");
        pointsEarned = input.nextInt();
        System.out.println("Please enter the total number of possible points for this assignment: ");
        pointsTotal = input.nextInt();
        score = Divide(pointsEarned, pointsTotal) * 100;
        System.out.println("The student's assignment score is : " + score + " percent.");

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!

    }

/*    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
    }*/

}
