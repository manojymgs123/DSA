import java.util.*;
public class isPrime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
       for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        } 
        return true;
    }
    public static void primesInRange(int lowerN, int n) {
        for(int i=lowerN; i<=n;i++){
            if(isPrime(i)){
              System.out.print(i+" ");
            }  
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lowerN=sc.nextInt();
            int n = sc.nextInt();

            primesInRange(lowerN, n);
        }
    }
}
