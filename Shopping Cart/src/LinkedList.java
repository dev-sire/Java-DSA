class Node{
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void append(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void prepend(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void listIterator(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void remove(String data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            if(head == null){
                tail = null;
            }
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                if(current.next == null){
                    tail = current;
                }
                return;
            }
            current = current.next;
        }
    }
}