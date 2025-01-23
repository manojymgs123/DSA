import java.util.*;


public class LargestDigitOfArray {
    
    public static String LargestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length ;i++){

            arr[i] = nums[i] + "";
        }
    Arrays.sort(arr,(a,b)-> {
        long n1 = Long.parseLong(a + b);
        long n2 = Long.parseLong(b + a);
        if(n1 > n2){
            return 1;

        } else  if( n2 > n1 ){
            return -1;
        }else{
            return 0;
        }

    });

        StringBuilder sb = new StringBuilder("");        
        for(int i = arr.length- 1;i >= 0 ;i--){
            sb.append(arr[i]);
        }

        return sb.toString() ;
    }

  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] nums = new int[n];
     // int[] temp = new int[n];

     for(int i=0;i<nums.length ;i++){
        nums[i]=sc.nextInt();
      }
      System.out.println(LargestNumber(nums));
    }
}
}



    
