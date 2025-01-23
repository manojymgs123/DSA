public class sorting3 {
    public static void main(String[] args) {
        long[] arr = {2,8,14,19,25,29,56};
        for (int index = 0; index < arr.length - 1; index++) {
            if ((arr[index+1] - arr[index] )>= 10) {
                System.out.println(arr[index]+","+arr[index + 1]);
            }
        }
    }
    
}
