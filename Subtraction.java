/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Etob media
 */
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Generate two single-digit random integers
        int number1 = (int) (Math.random() * 12);
        int number2 = (int) (Math.random() * 12);

        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            // Swap values
            int number = number1;
            number1 = number2;
            number2 = number;
        }

        //  ensuring that the students answer
        System.out.print("What is " + number1 + " - " + number2 + "=? ");
        
        // student's answer
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        // verifying if the answer is correct
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }
    }
 
}
