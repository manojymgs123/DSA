

public class sorting2 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int[] a = {1,2,3,5,7,-1,-2};
        int[] b = {1,2,3,7,6,-1,-2};
        int[] d = new int[a.length];
        int index = 0;
        int j = 0;
        while (index != a.length && j != b.length ) {
            
        
            
            
                    if(( d[index] = (a[index] + b[j] )) < 10) {
                        
                       
                        System.out.print(d[index]+" ");
                     index++;
                     j++;
                        }
                        
                    
                
            }
            
           }
        }
    
    

