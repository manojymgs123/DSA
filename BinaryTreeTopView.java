import java.util.*;
public class BinaryTreeTopView {
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

        static class info{
            Node node;
            int hd;

            public info(Node node , int hd){
                this.node = node;
                this.hd = hd;
            }
        } 
     

        public static void topView(Node root){
            Queue<info> q = new LinkedList<>();
            HashMap<Integer , Node> hm =  new HashMap<>();

            int min = 0;
            int max = 0;
            q.add(new info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                info curr = q.remove();
                if (curr== null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if (!hm.containsKey(curr.hd)) {
                        hm.put(curr.hd, curr.node);
                    }
    
                    if (curr.node.left != null) {
                        q.add(new info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
    
                    if (curr.node.right != null) {
                        q.add(new info(curr.node.right, curr.hd + 1));
                        max = Math.min(max, curr.hd + 1);
                    }   
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(hm.get(i).data+" ");
                System.out.println();
            }

        }
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            topView(root);

        }
    }

