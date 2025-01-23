import java.util.*;

import javax.xml.transform.stream.StreamSource;
public class pattern6 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sp = n/2;
    int st = 1;
    for (int index = 1; index <= n; index++) {
        for (int j = 1; j <= sp; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= st; k++) {
            System.out.print("*");
        }
        if (index<=n/2) {
            sp--;
            st+=2;
        } else {
            sp++;
            st-=2;
        }
        System.out.println();
    }
 }   
}
