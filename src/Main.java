import java.util.Scanner;
import java.util.*;

public class Main {
    public static String[] board;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "Player1";
        String winner = null;

        for (int a = 0; a < 9; a++){
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Let the Tic Tac Toe games begin!");
        Board.display();

        System.out.println("Player 1 will get the first move." +
                " Please enter the spot number you would like to place your marker.(X)");
        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (!(numInput>0 && numInput <= 9)) {
                    System.out.println("That's not a spot on the grid. Try again" +
                            "with something in the paying field!");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a spot on the grid. Try again" +
                        "with something in the paying field!");
                continue;
            }
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("player1")) {
                    turn = "Player2";
                }
                else {
                    turn = "Player1";
                }

                Board.display();
                winner = Evaluator.checkWinner();
            } else {
                System.out.println("That spot on the grid is already taken. Try again " +
                        "with a spot that hasn't been claimed.(Choose carefully!)");
            }
        }
        if (winner.equalsIgnoreCase("Catscratch")) {
            System.out.println("This match had no winner! Better luck next time!");
        } else {
            System.out.println("We have a winner! " + winner + "has won the match! Thank you for playing our game.");
        }
    }
}