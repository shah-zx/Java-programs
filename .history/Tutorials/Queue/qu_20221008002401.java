package Tutorials.Queue;

import java.util.Queue;

public class qu {
    private static final int LinkedBlockingQueue = 0;

    public static void main(String[] args) {
        System.out.println("Here we will learn about queue");
        Queue<Integer> queue = new java.util.concurrent.LinkedBlockingQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

    }
}
