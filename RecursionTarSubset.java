import java.util.Scanner;

public class RecursionTarSubset {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int tar = sc.nextInt();
            printTargetSumSubset(arr, 0, "", 0, tar);
        }

    }


    public static void printTargetSumSubset(int[] arr, int idx, String set, int sos, int tar){            //  sos = sum of set

        if (idx ==arr.length) {
            if (sos == tar) {
                System.out.println(set);
                
            }
            return;
        }
        printTargetSumSubset(arr, idx + 1, set + arr[idx]+",", sos+ arr[idx], tar);
        printTargetSumSubset(arr, idx + 1, set, sos, tar);
    }
    
}
