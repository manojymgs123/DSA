import java.util.*;
public class HeapsMedian5 {
    public static class MediamPriorityQueue{
    PriorityQueue<Integer>left ;
    PriorityQueue<Integer> right;

        public MediamPriorityQueue(){
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

                public void add(int val) {
               
                if(right.size() > 0 && val > right.peek()){
                    right.add(val);
                }else {
                    left.add(val);
                }
                if(left.size() - right.size() ==2){
                    right.add(left.remove());
                }else if(right.size() - left.size() ==2){
                    left.add(right.remove());
                }
                System.out.println(val);
                }
                
            
            public int remove() {
                if(this.size() ==0){
                    System.out.println("invalid number");
                    return -1;
                }else if(left.size() >= right.size()){
                  return left.remove();
                }  else{
                  return right.remove();
                }
               
            }
            public int peek() {
                if(this.size() ==0){
                    System.out.println("invalid number");
                    return -1;
                }else if(left.size() >= right.size()){
                  return left.peek();
                }  else{
                  return right.peek();
                }
                
            }
            public int size(){
              return left.size() + right.size();  
            }
        
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int index = 0; index < a.length; index++) {
                    a[index]= sc.nextInt();
                }
            }
            PriorityQueue<Integer>left = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> right= new PriorityQueue<>();
            System.out.print(left);
            System.out.print(right);

        }
    }
}

    
