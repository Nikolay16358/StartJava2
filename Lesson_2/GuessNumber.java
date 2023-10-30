import java.lang.Math;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player1.getName() + ", enter a number: ");
            player1.setNumber(scanner.nextInt());
            if (hiddenNumber > player1.getNumber()) {
                System.out.println("The number " + player1.getNumber() + " is less than the computer thought.");
            } else if (hiddenNumber < player1.getNumber()) {
                System.out.println("The number " + player1.getNumber() + " is more than the computer thought.");
            } else {
                System.out.println(player1.getName() + ", You are the winner!");
                break;
            }

            System.out.println(player2.getName() + ", enter a number: ");
            player2.setNumber(scanner.nextInt());
            if (hiddenNumber > player2.getNumber()) {
                System.out.println("The number " + player2.getNumber() + " is less than the computer thought.");
            } else if (hiddenNumber < player2.getNumber()) {
                System.out.println("The number " + player2.getNumber() + " is more than the computer thought.");
            } else {
                System.out.println(player2.getName() + ", You are the winner!");
                break;
            }
        }
    }
}
