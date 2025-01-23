import java.util.Scanner;

public class nextPermutation {
    public static void permutation(int[] num) {
        int i = num.length - 2;
        while (i >=0 && num[i]>= num[i + 1]) {
            i--;
        }

        if(i >= 0){
            int j = num.length - 1;
        while (j < 0 && num[i] <= num[i + 1]) {
            j--;
            swap(num,i,j);
        }
        reverse(num, i + 1);
        }
           System.out.print(num);
    }

    public static void swap(int[] num ,int i ,int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;

    }

    public static void reverse(int[] num , int start) {
        int end = num.length - 1;
        while (start < end) {
            swap(num ,start, end);
            start++;
            end--;
        }
    }
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] num = new int[n];
            int start= num[0];

            for (int index = 0; index < num.length; index++) {
                num[index] = sc.nextInt();
            }

        permutation(num);
        }
    }
}