import java.util.*;
public class pattern4{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < 2*x-1  ; i++) {
            for (int j = 0; j <= x*x - 2; j++) {
                if ((j==0 && i<x) || (j== x*x - 2 && i> x-3)) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
                if((j<x*x-2) && (i>x/2 && i< x+2 )) {
                    for (int k = 0;  k< x; k++) {
                        System.out.print("*");
                    }
                    for (int l= 0; l<i*(x-1);l++) {
                        System.out.print(" "); 
                    }
                } else {
                    
                }
            }
            System.out.println();
            }
        }
    }


    