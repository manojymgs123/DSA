import java.util.*;
public class HashSetRemoveDublicat {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,6,5,4,1,1,2,3,6,9,8,7,8,9,6,7,3};
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
