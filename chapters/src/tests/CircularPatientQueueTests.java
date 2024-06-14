package tests;

import chapter08.hl_queues.CircularPatientQueue;
import chapter08.hl_queues.Patient;

public class CircularPatientQueueTests {
    
    public static void main(String[] args) {
        System.out.println("****Unit Tests For CircularPatientQueue.java****\n");
        testQueueIsEmptyInitially();
        testEnqueueUpdatesNotEmptyNotFull();
        testDequeueUpdatesEmptyNotFull();
        testEnqueueUpdatesNotEmptyIsFull();
    }

    public static void testQueueIsEmptyInitially() {
        // set-up
        CircularPatientQueue queue = new CircularPatientQueue();
        boolean expectedEmptyNotFull = true;
        
        // what we are testing
        boolean actualEmptyNotFull = queue.isEmpty() && !(queue.isFull());

        // assertion
        if (expectedEmptyNotFull == actualEmptyNotFull) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }

    public static void testEnqueueUpdatesNotEmptyNotFull() {
        // set-up
        CircularPatientQueue queue = new CircularPatientQueue();
        int expectedSize = 3; 

        // what we are testing
        for(int i = 0; i < expectedSize; i++) {
            queue.enqueue(new Patient());
        }

        // assertion
        if (expectedSize == queue.getCurrentSize() && !queue.isEmpty() && !queue.isFull()) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }

    public static void testDequeueUpdatesEmptyNotFull() {
        // set-up
        CircularPatientQueue queue = new CircularPatientQueue();
        int expectedSize = 0; 
        int expectedCount = 3;
        for(int i = 0; i < 3; i++) {
            queue.enqueue(new Patient());
        }

        // what we are testing
        int actualCount = 0;
        while(!queue.isEmpty()) {
            Patient p = queue.dequeue();
            if (p != null) {
                actualCount = actualCount + 1;
            }
        }

        // assertion
        if (expectedCount == actualCount && expectedSize == queue.getCurrentSize() && queue.isEmpty() && !queue.isFull()) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }

    public static void testEnqueueUpdatesNotEmptyIsFull() {
        // set-up
        CircularPatientQueue queue = new CircularPatientQueue();
        int expectedSize = 10; 

        // what we are testing
        for(int i = 0; i < expectedSize; i++) {
            queue.enqueue(new Patient());
        }

        // assertion
        if (expectedSize == queue.getCurrentSize() && !queue.isEmpty() && queue.isFull()) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }
}
