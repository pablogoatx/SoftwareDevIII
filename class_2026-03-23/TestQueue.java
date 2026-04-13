import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Carlos");
        priorityQueue.add("Ana");
        priorityQueue.add("Luis");
        while (priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
