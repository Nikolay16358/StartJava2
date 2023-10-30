import java.lang.Math;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private static int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = (int) (Math.random() * 100 + 1);
        while (hiddenNumber != player2.getNumber()) {
            startGame(player1);
            if (hiddenNumber == player1.getNumber()) {
                break;
            }
            startGame(player2);
        }

        player1.setNumber(0);
        player2.setNumber(0);
    }

    private void startGame(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", enter a number: ");
        player.setNumber(scanner.nextInt());
        if (hiddenNumber > player.getNumber()) {
            System.out.println("The number " + player.getNumber() + " is less than the computer thought.");
        } else if (hiddenNumber < player.getNumber()) {
            System.out.println("The number " + player.getNumber() + " is more than the computer thought.");
        } else {
            System.out.println(player.getName() + ", You are the winner!");
        }
    }
}
