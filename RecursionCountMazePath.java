public class RecursionCountMazePath {
    public static void main(String[] args) {
        int n= 4, m=4;
        System.out.println(mazeWay(0, 0, n, m));
    }
    
    public static int mazeWay(int i,int j, int n,int m){

        if (i==n-1 && j==m-1) {
            return 1;
        }
        if ((i==n || j==m)) {
            return 0;
            
        }
        int W1 = mazeWay(i+1, j, n, m);
        int W2 = mazeWay(i, j+1, n, m);
        return W1 + W2;
    }
}
