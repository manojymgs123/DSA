public class LLRevr {
    Node head;
    Node tail;
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
        Node newNode = new Node(data); 
        size++;           //creating new node
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
//print
    public void print() {
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        Node temp = head;
            while(temp !=null){
                System.out.print(temp.data + "->");
                temp=temp.next;

            }
            System.out.println("null");

    }

//add in anywhere in linklist with index

    public void arrMiddle(int index, int data){
       
        if (index==0) {
           addFirst(data);
           return; 
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while (i < index - 1) {
            temp =temp.next;
            i++;
        }

        newNode.next = temp.next;               //linking of newnode to next node
        temp.next = newNode;                    //linking of previous node to newnode
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
    public static void main(String[] args) {
        
     
        LLRevr ll =new LLRevr();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.addFirst(6);
        ll.arrMiddle(0, 15);
        ll.print();
        ll.reverse();
        ll.print();
    }
}

