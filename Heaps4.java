import java.util.PriorityQueue;
import java.util.Scanner;

public class Heaps4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            int [] arr = {2,3,1,4,6,7,5,9,8};
            int k = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i<= k; i++) {
                pq.add(arr[i]);
            }
            for (int  i= k + 1; i < arr.length;  i++) {
                System.out.print(pq.remove() +" ");
                pq.add(arr[i]);
            }
            while (pq.size() > 0) {
                System.out.print(pq.remove() +" ");
                
            }
        }

    }
    
}
