import java.util.*;
public class MaximumSumSubarray{
    
    public static int solution( int[] arr){
        int csum = arr[0];
        int osum = arr[0];


        for(int i=0;i<arr.length;i++){
            if(csum >= 0){
                csum += arr[i];
            } else{
                csum = arr[i];
            }
            if(csum > osum ){
                osum = csum;
            }
        }
        return  osum-arr[0]; 
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
           

            
            int[] arr = new int[ n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(solution(arr)); 
        }
        
    } 
 }
