import java.util.Scanner;
public class pattern2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("@");
           }
           for (int index = 0; index < n; index++) {
            if (index==0 && index< n/2) {
                System.out.print(" ");
               for (int j= 0; j < n; j++) {
                System.out.print("*");
               } 
            }else{                
                for (int j = 0; j <= index*(n-1); j++) {
                    System.out.print(" ");
                }
                for (int j= 0; j < n; j++) {
                    System.out.print("*");
                }
                if (index==n-1) {
                   System.out.print("@"); 
                }
            }
            System.out.println();
           }
           for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n-1)*(n-1)+n; j++) {
                System.out.print(" ");
            }
            System.out.println("@");
           }
        }
    }
