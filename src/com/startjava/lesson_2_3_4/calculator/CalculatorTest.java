package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.println("Enter the first number: ");
                calculator.setNum1(scanner.nextInt());
                System.out.println("Enter the sign of a mathematical operation");
                calculator.setSign(scanner.next().charAt(0));
                System.out.println("Enter the second number: ");
                calculator.setNum2(scanner.nextInt());
                calculator.calculate();
                System.out.println("Do you want to continue calculating? [yes/no]: ");
            } else {
                System.out.println("Incorrect answer. Enter yes or no");
            }

            userAnswer = scanner.next();
        }
    }
}
