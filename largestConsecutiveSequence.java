import java.util.HashMap;
import java.util.Scanner;

public class largestConsecutiveSequence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int index = 0; index < arr.length; index++) {
                arr[index] = sc.nextInt();
                
            }
            HashMap<Integer , Boolean> hm = new HashMap<>();
            for (int val  : arr) {
                hm.put(val, true);
                
            }
            for (int val  : arr) {
                if(hm.containsKey(val - 1)){
                hm.put(val, false);
                }
            }

            int msp = 0;
            int ml = 0;
            for(int val : arr){
                if(hm.get(val)== true){
                    int tl = 1;
                    int tsp = val;
                

                while(hm.containsKey(tsp + tl)){
                    tl++;
                }
                if(tl>ml){
                    ml  =tl;
                    msp = tsp;
                }
            }
            }
            for (int index = 0; index < ml; index++) {
                System.out.print(msp + index);
                
            }
        }
    }
    
}
