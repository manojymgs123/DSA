import java .util.*;

public class RotateArray {
   
 
public static void reverse(int[] arr, int i , int j) {
    int Li = i;
    int Ri = j;
    while(Li < Ri){
        int temp = arr[Li];
        arr[Li] = arr[Ri];
        arr[Ri] = temp;
    }
     
}
public static int  rotate(int[] arr , int k) {
    k = k % arr.length;
    if(k < 0){
        k = k + arr.length;
    } 
    reverse(arr, 0, arr.length - 1 -k);
    reverse(arr, arr.length - k - 1, arr.length - 1);
    reverse(arr, 0, arr.length - 1);


    return arr[0];

}
public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
          }
           
          System.out.println((arr));
    }
       
  } 
}
