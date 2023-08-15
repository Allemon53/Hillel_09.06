package ua.hillel.lesson.lesson17.queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class FifoPriority {
    static Queue<Integer> integerPriorityQueueQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        linkedListQueueAdd();
        linkedListQueuePeek();
    }


    static void linkedListQueueIsEmpty() {
        while (!integerPriorityQueueQueue.isEmpty()) {
            System.out.print(integerPriorityQueueQueue.poll() + " ");
        }
    }

    static void linkedListQueuePeek() {
        while (integerPriorityQueueQueue.peek() != null) {
            System.out.print(integerPriorityQueueQueue.poll() + " ");
        }
    }

    static void linkedListQueueAdd() {
        integerPriorityQueueQueue.add(3);
        integerPriorityQueueQueue.add(2);
        integerPriorityQueueQueue.add(1);
        integerPriorityQueueQueue.add(4);
    }
}
