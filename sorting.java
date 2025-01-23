

public class sorting {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int[] a = {1,2,3,5,7,-1,-2};
        int[] b = {1,2,3,7,6,-1,-2};
        int[] c = {1,2,3,4,7,-1,-2};
        int[] d = new int[a.length];
       
        for (int index = 0; index < a.length; index++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    if(a[index]==b[j] && a[index]==c[k]) {
                        d[index] = a[index];
                        System.out.print(d[index]+" ");
                        
                        }
                    }
                }
            }
            
           }
        }
    
    

