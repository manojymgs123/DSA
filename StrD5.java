

public class StrD5 {
    public static void main(String[] args) {
        String str = "aabbbccdeeffggg"  ;
       // StringBuilder temp = new StringBuilder(str);
        char[] arr = new char[127];
        char[] temp = new char[127];

        str.length();
        int j = 0;
        for (int i = 0; i < str.length() - 1 ; i++){
            arr[i] = str.charAt(i);
 
            if(str.charAt(i) == str.charAt(i + 1)){
              temp[j] += arr[i];
              j++;
                
            }
            
        }
        temp[j] = arr[arr.length - 1];
    
        for (int i = 0; i < temp.length; i++){
        System.out.print(temp[i]);
   
    }
}
}

