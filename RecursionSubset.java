public class RecursionSubset {

    public static void findSubset(String str,String ans ,int i){
        // base case
        if (i==str.length()) {
            System.out.println(ans);
            return;
            
        }
        //recursion
        //choice yes
        findSubset(str, ans + str.charAt(i), i + 1);
        //choice no
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
    
}
