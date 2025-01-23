public class RecursionPermutation {

    public static void permutation(String str, String ans){
        if (str.length() == 0 ) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr= str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);  // if we run code on str string we found only two permu. because we substract
                                                                                    //  the size of str countinusly so we take string of new name besides str
            permutation(Newstr, ans + curr);
            
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permutation(str, "");
    }
    
}
