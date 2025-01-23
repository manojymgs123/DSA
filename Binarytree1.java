public class Binarytree1 {
    static  class Node{
         int data;
         Node left ;
         Node right;

         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx =  -1;
        public  Node buildTree(int[] nodes){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public  void preorder(Node root){

            if (root == null) {
                System.out.print("n"+" ");
               return ; 
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
    }
}

// public class Binarytree{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//          Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//          }
//     }
//  public class BinaryTree{
//     static int idx = -1;
//     public  Node buildTree(int[] nodes) {
//         idx++;
//         if (nodes[idx]==-1) {
//             return null;
//              }
//         Node NewNode = new Node(idx);
//         NewNode.left = buildTree(nodes);
//         NewNode.right = buildTree(nodes);

//         return NewNode;
//     }

//     public void preorder(Node root ){
//         if (root == null) {
//             return ;
//         }
//         System.out.println(root.data);
//         preorder(root.left);
//         preorder(root.right);
//     }
//     }

//     public static void main(String[] args) {
//         int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         tree.preorder(root);
     
//     }
// }
