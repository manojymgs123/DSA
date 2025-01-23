public class LlZigZag {
    static Node head;
    static Node tail;
    int size;
        public static class Node {
             int data;
             Node next;
        
            public Node(int data){          //constructor
                this.data=data;
                this.next=null;
            }
        }

        //add- frist
    public void addFirst(int data) {
        Node newNode = new Node(data);      //creating new node
        size++;

        if(head==null){
            head=tail= newNode;
            return;
        }
        
        newNode.next = head;            //linking of two node()
        head =  newNode;
    }
    
     //add in last
     public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail= newNode;
            return;
        }

        tail.next = newNode;
        tail=newNode;
    
    }

    public void ptint(){
        if (head== null) {
            System.out.println("THIS LINKEDLIST IS EMPTY");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void zigZag(){
        Node slow = head;
        Node fast = head.next ;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
    
        //step2=reverse ll from midnode onword
        Node prev = null;
        Node curr = mid.next;
        Node next;
        mid.next = null;


        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;   //right half head
        Node left = head;
        Node nextL , nextR;

        //alternate merging
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }      
    }
    public static void main(String[] args) {
        LlZigZag ll = new LlZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.ptint();
        ll.zigZag();
        ll.ptint();

    }
}
