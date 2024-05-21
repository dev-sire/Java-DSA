import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.addFirst("Mango");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.size());
        linkedList.clear();
        System.out.println(linkedList.isEmpty());
    }
}