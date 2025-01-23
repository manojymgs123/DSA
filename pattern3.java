 import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=  sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print("@");
            for (int j = 0; j < i*(x-1); j++) 
                System.out.print(" ");
                for (int j2 = 0; j2 < x; j2++) 
                    System.out.print("*");
                
                if(i==x-1){
                    System.out.print("@");
                }
        System.out.println();
        }
        for (int i = 0; i < x-1; i++) {
            for (int j = 0; j <= (x)*(x-1)+1; j++) {
              System.out.print(" ");
            }
            System.out.print("@");  
            System.out.println();
        }
    }
}
