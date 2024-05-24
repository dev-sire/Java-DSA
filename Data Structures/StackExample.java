import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println(stack);

        int removedElement = stack.pop();
        System.out.println(removedElement);

        System.out.println(stack);

        int topElement = stack.peek();
        System.out.println(topElement);

        int position = stack.search(3);
        System.out.println(position);

        System.out.println(stack.isEmpty());

    }
}
