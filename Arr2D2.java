import java.util.*;
    public class Arr2D2 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); 
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                for (int i = 0; i < arr.length ; i++) {
                    for(int j=0; j<arr[0].length  ; j++){
                        arr[i][j] = sc.nextInt();  
                    }
               } 

      int minr = 0;
      int minc = 0;
      int maxr = arr.length - 1;
      int maxc = arr[0].length - 1;
      int tct = n*n;   // tct total count turn 
      int cct = 0;    //current count turn
      
      
      while(cct < tct){
            for (int i = minr, j= minc; i < arr.length && cct < tct ; i++) {
            System.out.print(arr[i][j] );
            cct++;
            }

            minc++;

            for (int j = minc,i= maxr;j< arr[0].length && cct < tct ; j++) {
            System.out.print(arr[i][j] );
            cct++;
            }

            maxr--;

            for(int i = maxr,j = maxc; i >=minr && cct < tct ; i--){
            System.out.print(arr[i][j] );
            cct++;
            }

            maxc--;

            for(int j = maxc,i = minr;j>=minc && cct < tct ; j--){
            System.out.print(arr[i][j] );
            cct++;
            }

            minr++;

        }
      }
   }
