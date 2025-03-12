package Project;

public class TicTacToeBoard {
    public static void main(String[] args) {
        for (int row = 0; row < 3; row++) {
          
            for (int col = 0; col < 3; col++) {
                if (row == 1 && col == 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print("   ");
                }
                if (col < 2) System.out.print("|");
            }
            System.out.println();

        
            if (row < 2) System.out.println("-----------");
        }
    }
}