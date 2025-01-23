import java.util.PriorityQueue;

public class Heaps1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ranks = {99 , 33 , 11 , 78 , 0 , 879 , 445 , 4415 , 44 , 1 , 2 , 3};
        for ( int val : ranks) {
            pq.add(val);
            
        }
        while(pq.size()> 0){
            System.out.print(pq.remove() + " ");
        }
    }
}
