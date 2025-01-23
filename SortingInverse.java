public class SortingInverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] inv = new int[arr.length+1  ];
        for (int index = arr.length; index >=1 ; index--) {
            
        
        int val = arr[index];
        inv[val] = index;
        System.out.print(inv[val]); 
    }
    
}
}
