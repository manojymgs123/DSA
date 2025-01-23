import java.util.*;


public class Kth2{
  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      //int k = sc.nextInt();
      int[] arr = new int[n];
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      int k = sc.nextInt();

      for(int i=0;i<arr.length ;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if( i== k - 1){
            System.out.println(arr[i]);
            break;
        }
      }
    }
}
}

