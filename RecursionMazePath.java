import java.util.ArrayList;

public class RecursionMazePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
       ArrayList<String> paths= printMazePath(1, 1, m, n);
       System.out.println(paths);
    }
    
    public static ArrayList<String> printMazePath(int sr, int sc,int dr,int dc ){
        if (sc==dc && sr==dr) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();

        if (sc < dc ) {
            hpaths = printMazePath(sr, sc + 1, dr, dc);
    
        }
        if (sr < dr ) {
            vpaths= printMazePath(sr+1, sc, dr, dc);
        }
        

        ArrayList<String> paths= new ArrayList<>();
        for (String hpath : hpaths) {
           paths.add("h" + hpath); 
        }

        for (String vpath : vpaths) {
            paths.add("v" + vpath); 
         }
         
         return paths;


    }
}
