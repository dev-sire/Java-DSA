//Queues From Stacks

import java.util.Stack;

class MyQueue {

    Stack<Integer> stackPush;
    int stackPushTop = -1;
    Stack<Integer> stackPop;
    int stackPopTop = -1;

    public MyQueue() {
        // Implement the constructor
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void push(int x) {
        // Implement this function

        while(stackPopTop >= 0){
            stackPush.add(stackPop.get(stackPopTop));
            stackPushTop++;
            stackPop.remove(stackPopTop--);
        }
        stackPush.add(x);
        stackPushTop++;

        while(stackPushTop >= 0){
            stackPop.add(stackPush.get(stackPushTop));
            stackPopTop++;
            stackPush.remove(stackPushTop--);
        }
    }

    public int pop() {
        // Implement this function

        if(stackPopTop == -1) return 0;

        int num = stackPop.get(stackPopTop);
        stackPop.remove(stackPopTop--);

        return num;
    }

    public int peek() {
        // Implement this function

        if(stackPopTop == -1) return 0;

        return stackPop.get(stackPopTop);
    }

    public boolean empty() {
        // Implement this function

        return stackPopTop == -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */