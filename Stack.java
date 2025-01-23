import java.util.*;


public class Stack{
  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] arr = new int[n];
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
     int lsf = Integer.MAX_VALUE;         //lfs=least so far
     int op = 0;                          // op = original price
     int pist = 0;                        // pist = price if sold today
     for(int i=0;i<arr.length;i++){
        if( arr[i] < lsf){
            lsf = arr[i];
        }
        pist = arr[i] - lsf;
        if(pist > op){
            op = pist;
        }

    }
      System.out.println(op);
   }
  }
}

    