import java.util.*;
public class StrMaximumCharactor8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            HashMap<Character,Integer> hm = new HashMap<>();
            for (int index = 0; index < str.length(); index++) {
                char ch = str.charAt(index);
                if (hm.containsKey(ch)) {
                    int of = hm.get(ch);
                    int nf = of + 1;
                    hm.put(ch , nf) ;

                } else{
                    hm.put(ch, 1);
                }
                
            }
            char mfc = str.charAt(0);                     // mcf= maximum frequency charactor
            for (Character key : hm.keySet()) {
                if (hm.get(key) > hm.get(mfc)) {
                    mfc = key;
                    
                }
                
            }
            System.out.println(mfc);
        }
    }

    
}