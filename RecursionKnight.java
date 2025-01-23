import java.util.*;
public class RecursionKnight {
    public static void main(String[] args) throws Exception {
           try (Scanner scn = new Scanner(System.in)) {
               int n =scn.nextInt();
               int r =scn.nextInt();
               int c =scn.nextInt();

               int[][] chess = new int[n][n];
               if (prinrKnightTour(chess, r , c ,1)) {
                System.out.println("solution exist");
                displayBoard(chess);
               }else{
                System.out.println("solution does not exit");
               }
        }
    }
    public static boolean prinrKnightTour(int[][]chess,int r,int c ,int move){
        if(r < 0 || c < 0 || r>= chess.length || c>=chess.length || chess[r][c] > 0 ){
            return false;
            } else if(move==chess.length * chess.length){
                    chess[r][c] = move;
                    displayBoard(chess);
                    chess[r][c] = '.';
                    return false;
            }
        
        chess[r][c] = move;
        prinrKnightTour(chess, r - 2, c + 1 , move + 1);
        prinrKnightTour(chess, r - 1, c + 2 , move + 1);
        prinrKnightTour(chess, r + 2, c + 1 , move + 1);
        prinrKnightTour(chess, r + 1, c + 2 , move + 1);
        prinrKnightTour(chess, r - 2, c - 1 , move + 1);
        prinrKnightTour(chess, r - 1, c - 2 , move + 1);
        prinrKnightTour(chess, r + 2, c - 1 , move + 1);
        prinrKnightTour(chess, r + 1, c - 2 , move + 1);
        chess[r][c] = 0;

       return true; 
    }

    public static void  displayBoard(int[][]chess){
       for(int i = 0; i < chess.length; i ++){
          for(int j= 0; j < chess.length;j++){
            System.out.print(chess[i][j] + " ");
          }
          System.out.println();
       }
    }
}
