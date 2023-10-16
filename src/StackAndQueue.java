import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

    public static int countKeyInStack(Stack<Integer> arg, int key) { // complete this method
        Stack<Integer> temp = new Stack<>();
        int count = 0;

        while (!arg.isEmpty()) {
            int num = arg.pop();
            if (num == key) {
                count++;
            }
            temp.push(num);
        }
        while (!temp.isEmpty()) {
            int num = temp.pop();
            arg.push(num);
        }
        return count;
    }

//• To create a queue: Queue<Integer> name = new LinkedList<>();
//• To find the size: name.size();
//• To enqueue: name.add(15);
//• To peek: name.peek();
//• To dequeue: name.poll();
    public static int countKeyInQueue(Queue<Integer> arg, int key) { //complete this method
        int count = 0;
        int size = arg.size();

        for (int i= 0; i < size; i++) {
            int num = arg.poll();
            if (num == key) {
                count++;
            }
            arg.add(num);
        }
    return count;
    }
}
