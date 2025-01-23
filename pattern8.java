import java.util.*;
public class pattern8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m= 0;
    for (int i = 0; i < 2*n-1; i++) {
      for (int index = 0; index <= n*n-2; index++) {
        if ((index==0 && i<n) ||(index==n*n-2 &&(i>n-2))) {
            
            System.out.print("@");
        } else {
            System.out.print(" ");
        }
        if (i>=n/2 && i<n+2) {
            for (int k = 0; k < n; k++) {
                System.out.print("*");
                for (int j = 0; j < 4*m; j++) {
                    System.out.print(" ");
                    m++;
                }
        }
        }
        
      }
      System.out.println();  
    }
   } 
}
