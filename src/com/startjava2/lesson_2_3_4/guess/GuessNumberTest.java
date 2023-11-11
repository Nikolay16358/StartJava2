package com.startjava2.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the first player: ");
        Player player1 = new Player(scanner.next());
        System.out.println("Enter the name of the second player: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while (!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                game.play();
                System.out.println("Do you want to continue the game? [yes/no]: ");
            } else {
                System.out.println("Incorrect answer. Enter yes or no");
            }

            playerAnswer = scanner.next();
        }
    }
}
