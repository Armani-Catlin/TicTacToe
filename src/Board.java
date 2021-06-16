import java.util.Scanner;
import java.util.*;

public class Board {
    public static void display(){ //set an array value for each of the rows on the board
        String[] board = {"0","1","2","3","4","5","6","7","8"}; //will be displayed in the format of individual spots, then a line to seperate, then the next spot
        System.out.println("   |   |   ");
        System.out.println(" " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " ");
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " ");
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " ");
        System.out.println("   |   |   ");
    }

    /*public void players(){
        boolean Player1 = true;
        boolean Player2 = true;
    }

    public void spotPicker(){
        int numTurns = 9;
        String spot;
        Scanner oneInput = new Scanner(System.in);
        while(numTurns != 0) {
            spot = oneInput.nextLine();

            numTurns--;
        }
    }*/
}
//Eight total win conditions
//Draw means number of turns runs out
//Need to write a case for each win condition
//