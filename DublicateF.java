import java.util.*;


public class DublicateF{
  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      int[] temp = new int[n];

     for(int i=0;i<arr.length ;i++){
        arr[i]=sc.nextInt();
      }
            int j =0 ;
            for(int i=0;i<arr.length - 1;i++){
               // for(int j = i + 1;j<arr.length;j++){

                if( arr[i] == arr[i + 1]){
                    temp[j] = arr[i];
                    j++;
                }
            }
            //temp[j] = arr[arr.length - 1];
            for(int i=0;i<temp.length;i++){
                System.out.print(temp[i] +" ");
            }
        }
    }
}




