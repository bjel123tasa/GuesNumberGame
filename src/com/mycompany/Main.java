package com.mycompany;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 37;
        int b = 5;
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello" + name + "  Nice to meet you.");
        System.out.println("Do you want to play game with me?");
        String answer = scanner.next();
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to play game with me?");
            answer = scanner.next();
        }
        Random random = new Random();
        int x  = random.nextInt(20) + 1;
        System.out.println("Please guess  a number.");
        int firstNumber = scanner.nextInt();


        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldBeFinish = false;


        while (!shouldBeFinish){
            if (timeTried > 4){
                shouldBeFinish = true;
                hasWon = false;
                continue;
            }

            if (x ==  firstNumber){
                hasWon = true;
                shouldBeFinish = true;
                timeTried++;
            }
            else if (firstNumber < x){
                System.out.println("Guess higher.");
                firstNumber = scanner.nextInt();
                timeTried++;
            }
            else if (firstNumber > x){
                System.out.println("Guess lower.");
                firstNumber = scanner.nextInt();
                timeTried++;
            }

        }

        if (hasWon){
            System.out.println("Congratulations! You have guessed the number.");
        }
        else System.out.println("Game over!");
        System.out.println("The number was " + x);
    }
}

