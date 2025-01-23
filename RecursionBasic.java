public class RecursionBasic {
   public static void chamgeArr(int[] arr ,int i , int val){
    if (i == arr.length) {
        print(arr);
        return;
        }
        //recursion
        arr[i] = val;
        chamgeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] -1;       //backtracking
    }

    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        chamgeArr(arr, 0, 1);
        print(arr);

    }
    
}
