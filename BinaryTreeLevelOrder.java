import java.util.*;
public class BinaryTreeLevelOrder {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
             this.left = null;
             this.right = null; 
        }
    }

    public static class BinaryTree{
        static int index = -1;
        public Node buildTree(int[] nodes){
            index++;
            if (nodes[index] == -1) {
                return  null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left= buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        } 
    
        public void levelOrder( Node root){
            if (root == null) {
                return ;
            }
            
            Queue<Node> qu = new LinkedList<>();
            qu.add(root);
            qu.add(null);

            while (!qu.isEmpty()) {
               Node curNode = qu.remove();
               if (curNode == null) {
                    System.out.println();
                    if (qu.isEmpty()) {
                       break; 
                    }else{
                        qu.add(null);
                    }

                }else{
                    System.out.print(curNode.data+" ");
                    if (curNode.left != null) {
                        qu.add(curNode.left);
                    }

                    if (curNode.right != null) {
                        qu.add(curNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
