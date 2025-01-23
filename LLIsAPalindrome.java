
public class LLIsAPalindrome {
    Node head;
    Node tail;
    int size;
    public static class Node{
        int data;
        Node next;
    

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if (head==null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if (head==null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //add anywhere in the linkedlist with index and value

    public void addAnywhere(int index ,int data){
        if (index==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data) ;
        Node temp = head;
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void print(){
        if(head == null){
            System.out.println("THIS LL IS EMPTY");
            return;
        }

        Node temp = head;

        while (temp !=null) {
            System.out.print(temp.data +"->"+" ");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;


        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }  
    
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head ;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean cheekPalindrome(){
        if (head==null || head.next==null) {
            return true;
        }

        //step1= find mid
        Node midNode = findMid(head);

        //step2=reverse ll from midnode onword
        Node prev = null;
        Node curr = midNode;
        Node next;


        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;   //right half head
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LLIsAPalindrome ll = new LLIsAPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.cheekPalindrome());
    }    
}
