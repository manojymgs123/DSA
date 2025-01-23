import java.util.PriorityQueue;
import java.util.Scanner;

public class heaps3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] ranks = {99 , 88 , 77 , 66 , 55 ,44 , 1 , 2 , 3};
            int k = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int index = 0; index < ranks.length; index++) {
            
                if(index < k){
                    pq.add(ranks[index]);
                    } else{
                        if(ranks[index] > pq.peek()){
                            pq.remove();
                            pq.add(ranks[index]);
                        }
                    }
                }

            while(pq.size() > 0 ){
                System.out.print(pq.peek()+" ");
                pq.remove();
            }
        }
    }
}
