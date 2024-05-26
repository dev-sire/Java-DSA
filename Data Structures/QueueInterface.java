import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
   public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);
   }
}
