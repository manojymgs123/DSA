public class SoretingMedian {
    public static void main(String[] args) {
        int[] a = {1,2,4,18,99};
        int[] b = {3,5,8,9,10,11,69};
        float median =mergeTwoSortedArray(a, b);
        System.out.println(median);

    }

    
        public static float mergeTwoSortedArray(int[] a,int[] b){
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

       float median = (float) 0.00;
        int mid = c.length/2;
        if (c.length%2==1) {
           median= c[mid + 1];
            
        }else{
            median = (float) ((c[mid] + c[mid + 1])/2.0);
        }
    
        return median;
        
    }
    
}

