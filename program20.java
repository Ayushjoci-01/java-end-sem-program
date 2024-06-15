/*Write a java program for to solve producer consumer problem in which a
producer produces a value and consumer consume the value before producer
generate the next value*/
import java.util.LinkedList;
import java.util.Queue;

public class program20{
    public static void main(String[] args) {
        final int BUFFER_CAPACITY = 5;
        Queue<Integer> buffer = new LinkedList<>();

        Thread producerThread = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == BUFFER_CAPACITY) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Produced: " + value);
                    buffer.add(value++);
                    buffer.notify();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int consumedValue = buffer.poll();
                    System.out.println("Consumed: " + consumedValue);
                    buffer.notify();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

