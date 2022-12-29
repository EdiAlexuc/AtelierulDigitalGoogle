package Concurrency.CodeChallenge3;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.start();
        player2.start();

        try {
            player1.join();
            player2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (player1.getChoice().equals(player2.getChoice())) {
            System.out.println("It's a tie!");
        } else if (player1.getChoice().equals("rock") && player2.getChoice().equals("scissors")) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getChoice().equals("paper") && player2.getChoice().equals("rock")) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getChoice().equals("scissors") && player2.getChoice().equals("paper")) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }

    }
}
