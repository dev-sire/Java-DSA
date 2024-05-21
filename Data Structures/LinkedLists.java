class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;

    public void LinkedLists(){
        this.head = null;
        this.tail = null;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void prepend(int data){
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
    public void remove(int data){
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
public class LinkedLists{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.prepend(1);
        ll.remove(4);
        ll.listIterator();
    }
}