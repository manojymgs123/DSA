import java.util.*;    
public class pattern9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int index = 0; index < 2*n-1; index++) {
      if (index<n) {       
        System.out.print("@");
      }
      if (index>=n/2 && index<n+2) {
        for (int j = 0; j <4*(index-2) ; j++) {
          System.out.print(" ");
        }
        for (int k = 0;  k< n; k++) {
          System.out.print("*");
        }

      
    }       
              System.out.println(); 
    }
  }  
}
