import java.lang.Math;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private static int hiddenNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = (int) (Math.random() * 100 + 1);
        while (hiddenNumber != player2.getNumber()) {
            isMove(player1);
            if (hiddenNumber == player1.getNumber()) {
                break;
            }

            isMove(player2);
        }

        player1.setNumber(0);
        player2.setNumber(0);
    }

    private boolean isMove(Player player) {
        enterNumber(player);
        if (hiddenNumber > player.getNumber()) {
            System.out.println("The number " + player.getNumber() + " is less than the computer thought.");
            return false;
        }

        if (hiddenNumber < player.getNumber()) {
            System.out.println("The number " + player.getNumber() + " is more than the computer thought.");
            return false;
        }

        System.out.println(player.getName() + ", You are the winner!");
        return true;
    }

    private int enterNumber(Player player) {
        System.out.println(player.getName() + ", enter a number: ");
        player.setNumber(scanner.nextInt());
        return player.getNumber();
    }
}
