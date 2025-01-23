import java.util.*;
public class SortingTriplet {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,8,7};
        countTriplet(arr);
    }
    
    public static void countTriplet(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int index = arr.length - 1; index >=1 ; index--) {
            int l = 0;
            int r = arr.length -1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[index]) {
                   count++;
                   l++;
                   r--; 
                }else if(arr[l] + arr[r] < arr[index]){
                    l++;
                }else{
                    r--;
                }
            }
        }
        System.out.println(count);

    }
}
