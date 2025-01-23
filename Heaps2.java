import java.util.Collections;
import java.util.PriorityQueue;

public class Heaps2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks = {99 , 88 , 77 , 66 , 55 ,44 , 1 , 2 , 3};
        for ( int val : ranks) {
            pq.add(val);
            
        }
        while(pq.size()> 0){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
