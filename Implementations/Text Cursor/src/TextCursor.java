public class TextCursor extends DoublyLinkedList {
    private Node cursor;

    public TextCursor(){
        super();
        this.cursor = this.head;
    }
    public void moveCursorForward(){
        if(cursor != null && cursor.next != null){
            cursor = cursor.next;
        }
    }
    public void moveCursorBackwards(){
        if(cursor != null && cursor.prev != null){
            cursor = cursor.prev;
        }
    }
    public void printListWithCursor(){
        Node current = head;
        while(current != null){
            if(current == cursor){
                System.out.print("["+current.data+"] ");
            } else {
                System.out.print(current.data+" ");
            }
            current = current.next;
        }
        System.out.println();
    }
    @Override public void append(int data){
        super.append(data);
        if(cursor == null){
            cursor = tail;
        }
    }
    @Override public void prepend(int data){
        super.append(data);
        if(cursor == null){
            cursor = head;
        }
    }
    public static void main(String[] args) {
        TextCursor list = new TextCursor();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.printListWithCursor();

        System.out.println("Moving cursor forward: ");
        list.moveCursorForward();
        list.printListWithCursor();

        System.out.println("Moving cursor forward: ");
        list.moveCursorForward();
        list.printListWithCursor();

        System.out.println("Moving cursor backwards: ");
        list.moveCursorBackwards();
        list.printListWithCursor();
    }
}
