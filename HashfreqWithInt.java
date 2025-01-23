import java.util.*;
public class HashfreqWithInt {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5,5,6,6,9,9,8,7,7,7,4,5,6,5,7,4,4,4,5,5,6,6,63,54,77,1,0,0,0,0,0,};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hm);
    }
}
