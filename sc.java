
public class sc {

    public static int nextInt() {
        return 0;
    }

}
import java.util.Scanner;

public class RecursionNqueen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            char[][] chess = new char[n][n];
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    chess[i][j] = '.';
                }
            }
            
            NQueen(chess,  0);
        }

    }

        public static void printChess(char[][] chess){
            System.out.println("------------CHESS BOARD-------------");
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    System.out.print(chess[i][j]+" ");
                }
                System.out.println();
            }
        }


    public static void NQueen(char[][] chess ,  int row){       // qsf = queen so for

        if (row==chess.length) {
            printChess(chess);
            return ;
            
        }

        for (int j = 0; j < chess.length; j++) {
            if(isQueenSafe(chess,row,j)){
                chess[row][j]= 'Q';
                NQueen(chess,  row + 1);  //function call
                chess[row][j]='X';           //backtracking step
            }
        }
    }

    public static boolean isQueenSafe(char[][] chess, int row , int col){
        // vertically UP
        for (int index = row-1 ; index >= 0; index--) {
            if (chess[row][col] == 'Q') {
                return false;
                
            }
            
        }

        //LEFT DIAGONAL UPWORD
        for (int index = row -1, j=col-1; index >= 0 && j >=0 ; index--, j--) {
            if (chess[row][col] == 'Q') {
                return false;
                
            }

        }

        //RIGHT DIAGONAL UPWORD
        for (int index = row-1 , j=col+1; index >=0 && j <chess.length ; index--, j++) {
            if (chess[row][col] == 'Q') {
                return false;
                
            }

        }

        return true;

    }
    
}
