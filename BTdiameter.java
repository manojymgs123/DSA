public class BTdiameter {
        public static class Node{
                int data;
                Node left;
                Node right;
        
                public Node(int data){
        
                    this.data = data;
                    this.left = null;
                    this.right = null;
                } 
            }
            public static int hieght(Node root){
                if (root==null) {
                    return 0;
                }
                
                int lh = hieght(root.left);
                int rh = hieght(root.right);
        
                return  Math.max(lh, rh)+ 1;
            }

            public static int diameter(Node root){
                if (root == null) {
                    return 0;
                }

                int ld = diameter(root.left);
                int lh = hieght(root.left);
                int rd = diameter(root.right);
                int rh = hieght(root.right);

                int selfDia = lh + rh + 1;

                return Math.max( selfDia , Math.max(ld , rd));
            }
        
            public static void main(String[] args) {
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left = new Node(6);
                root.right.right = new Node(7);
        
        
                System.out.println(diameter(root));
            }
        }
