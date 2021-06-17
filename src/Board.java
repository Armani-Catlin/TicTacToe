public class Board {
    public static void display(){
        String[] board = {"0","1","2","3","4","5","6","7","8"};
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
    }
}