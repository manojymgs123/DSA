import java.util.Scanner;   
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i <= n/2 + 1; i++) {
           for (int j = 0; j < 3*n/2 - i+1; j++) {
            System.out.print(" "+" ");
           }
            for (int j2 = 0; j2 < 2*i-1; j2++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+" ");
            }
                System.out.print("@"+" ");
            
            for (int j4 =0; j4<n- 2; j4++) {
                System.out.print(" "+" ");
            }
                System.out.print("@"+" ");
                System.out.println();
            
        }

        for (int i =0; i < n/2+1; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j < n-(i*2); j++) {
                System.out.print("*"+" ");
            }
            
                if ( i==0) {
                    System.out.print("@"+" "); 
                    for (int j2 = 0; j2 < n-2; j2++) 
                    System.out.print(" "+" ");
                    System.out.print("@"+" "); 

                    for (int j3 = 0; j3 < n;j3++ ) {
                        System.out.print("*"+" ");
                    }
                }
                 else{
                    for (int j2 = 0; j2 < n+i*2; j2++) 
                        System.out.print(" "+" ");
                    
                    for (int j2 = 0; j2 < n - i*2; j2++) 
                        System.out.print("*"+" ");
                        
                    }
                    System.out.println();
            }
            System.out.println();
        }
    }

    

