import java.util.*;
public class HashSetUnion {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,6,7,8,9,10};
            int [] arr2 = {3,4,5,6,7,8,9,10,11,12};

            HashSet<Integer> hs = new HashSet<>();

            for (int j = 0; j < arr2.length; j++) {
            hs.add(arr2[j]);
            }

            for (int i = 0; i < arr.length; i++) {
                if (hs.contains(arr[i])) {
                    System.out.print(arr[i] + " ");
                }
            }
            
        }
}
