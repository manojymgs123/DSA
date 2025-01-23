import java.util.*;
public class pattern10 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < 2*n - 1; i++) {
       for (int j = 0; j < 2*n*(n-2) + 1; j++) {
        if((j==0 && i<n) || (j==2*n*(n-3) && i>n+2)){
            System.out.print("@");
                } 
        }
         if (i>=n/2 && i<3*n/2) {
           for (int k = 0; k <(n-1)*(i-n/2) ; k++) {
              System.out.print(" ");
            }
           for (int k = 0;  k< n; k++) {
             System.out.print("*");
            }
            for (int k = 0; k <(n-1)*(i-n/2) ; k++) {
              System.out.print(" ");
            }
          
          }
          if (i>n-2) {
              
              for (int j = (2*n-1)/2; j >= 0 ; j-=3) {
                System.out.print(" ");
              }
              System.out.print("@");
            }
          
        
        System.out.println();
       } 
    }

   } 

