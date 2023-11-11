package com.startjava2.lesson_2_3_4.guess;

import java.lang.Math;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = (int) (Math.random() * 100 + 1);
        do {
            if (isGuessed(player1)) {
                break;
            }
        } while (!isGuessed(player2));

        player1.setNumber(0);
        player2.setNumber(0);
    }

    private boolean isGuessed(Player player) {
        enterNumber(player);
        int playerNumber = player.getNumber();
        if (hiddenNumber == playerNumber) {
            System.out.println(player.getName() + ", You are the winner!");
            return true;
        }

        if (hiddenNumber > playerNumber) {
            System.out.println("The number " + playerNumber + " is less than the computer thought.");
        } else {
            System.out.println("The number " + playerNumber + " is more than the computer thought.");
        }

        return false;
    }

    private int enterNumber(Player player) {
        System.out.println(player.getName() + ", enter a number: ");
        return player.setNumber(scanner.nextInt());
    }
}
