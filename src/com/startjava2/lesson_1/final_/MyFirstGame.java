package com.startjava2.lesson_1.final_;

public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNumber = 38;
        int playerNumber = 48;
        while (hiddenNumber != playerNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }

        System.out.println("Вы победили!");
    }
}
