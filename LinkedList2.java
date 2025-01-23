
class LinkedList2{
    Node head;
    Node tail;
    public static class Node {
        String data;
        Node next;
    
    public Node(String data){                //constructor
                this.data=data;
                this.next=null;
        }
    }
    //add- frist
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        
        newNode.next = head;
        head =  newNode;
    }
    

    //add in last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next !=null){
            currNode=currNode.next;

        }
        currNode.next = newNode;
    
    }
//print
public void printList() {
    if(head==null){
        System.out.println("this list is empty");
        return;
    }
    Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;

        }
        System.out.println("null");

}
    public static void main(String[] args) {
    

    
        LinkedList2 list = new LinkedList2();
        list.addFirst("of");
        list.addFirst("eample");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        list.addLast("linkedlist");
        list.printList();
     }


    


    }
