import java.util.Scanner;

public class SortingCeil {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int[] arr = {10,20,30,40,50,60,70,80,90};
            int lo = 0;
            int hi = arr.length - 1;
            int floor = 0;
            int ceil = 0;
            while (lo <= hi) {
                int mid = (lo + hi)/2;
                if (x < arr[mid]) {
                   hi = mid - 1;
                   ceil = arr[mid]; 
                }else if(x > arr[mid]){
                    lo = mid + 1;
                    floor = arr[mid];
                }else if(x == arr[mid]){
                    hi=lo=mid;
                    ceil = arr[mid];
                    floor = arr[mid];
                }
            }
            System.out.println(floor);
            System.out.println(ceil);
        }
    }
    
}
