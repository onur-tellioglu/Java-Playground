package net.usav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Trivia Game!");

        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name + "! Let's start the game!");

        System.out.println("\nQuestion 1: What is the capital of France?"); // Question 1
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Rome");
        System.out.println("4. Berlin");
        System.out.print("Your answer: ");
        String answer1 = scanner.next();
        if (answer1.equals("1")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("\nQuestion 2: What is the capital of Germany?"); // Question 2
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Rome");
        System.out.println("4. Berlin");
        System.out.print("Your answer: ");
        String answer2 = scanner.next();
        if (answer2.equals("4")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("\nQuestion 3: What is the capital of Italy?"); // Question 3
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Rome");
        System.out.println("4. Berlin");
        System.out.print("Your answer: ");
        String answer3 = scanner.next();
        if (answer3.equals("3")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("\nQuestion 4: What is the capital of England?"); // Question 4
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Rome");
        System.out.println("4. Berlin");
        System.out.print("Your answer: ");
        String answer4 = scanner.next();
        if (answer4.equals("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        scanner.close();

        if (score == 4) {
            System.out.println("\nCongratulations " + name + "! You got all the answers correct!");
        } else {
            System.out.println("\n" + name + ", you got " + score + " out of 4 correct!");
        }
    }
}