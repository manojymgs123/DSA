public class LlMergeSortLinkedList {
    
        Node head;
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
    
    public  Node mergeSort(Node head){

        if (head==  null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //call merge sort for left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft =  mergeSort(head);
        Node newright =  mergeSort(rightHead);


        //merge
        return merge(newleft , newright);


    }


    public Node getMid(Node head){
         Node slow = head;
         Node fast = head.next;

         while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

         }

         return slow;
    }

    public Node merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1= head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2= head2.next;
                temp = temp.next;

            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1= head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2= head2.next;
            temp = temp.next;
        }
    

        return mergeLL.next;
    }

    public static void main(String[] args) {

        LlMergeSortLinkedList ll = new LlMergeSortLinkedList();
        ll.addFirst(5);
        ll.addFirst(18);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(2);
        ll.addFirst(100);
        ll.ptint();
        ll.head = ll.mergeSort(ll.head);
        ll.ptint();
    }
}
