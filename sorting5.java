

public class sorting5 {
    public static void main(String[] args) {
        int[] a = {1,2,4,18,99};
        int[] b = {3,5,8,9,10,11,69};
        int[] mergedArray = mergeTwoSortedArray(a, b);
       print( mergedArray);

    }

        public static void print(int[] arr){
            for (int index = 0; index < arr.length; index++) {
                System.out.print(arr[index]+",");
            }
        }
        public static int[] mergeTwoSortedArray(int[] a,int[] b){
            int[] c =new int[ a.length + b.length ];
            int i = 0;
            int j = 0;
            int k = 0;

        while(i < a.length && j < b.length ){

                if(a[i] < b[j]){
                    c[k] = a[i];
                    i++;
                    k++;
                }else{
                    c[k] = b[j];
                    j++;
                    k++;
                }
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++; 
        }

        while (j < b.length) {
            c[k] = b[i];
            j++;
            k++; 
        }
    
        return c;
        
    }
    
}
    

