import java.util.Scanner;

public class Arr2D1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length ; i++) {
                for(int j=0; j<arr[0].length  ; j++){
                arr[i][j] = sc.nextInt();

            }

   }
   for(int j=0; j<arr[0].length ; j++) {
            if(j%2==0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                    for(int i=arr.length-1; i>=0; i--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
        }      
    }
}
