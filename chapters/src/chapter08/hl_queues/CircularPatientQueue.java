package chapter08.hl_queues;

public class CircularPatientQueue {
    
    // --- Data -------------------------------------------------
    Patient[] queue = new Patient[10];

    int head = 0;

    int tail = 0;

    // --- Constructor ------------------------------------------


    // --- Methods ----------------------------------------------
    public void enqueue(Patient p) {
        if (!isFull()) {
            queue[(tail % queue.length)] = p;
            tail = tail + 1;
        }
    }

    public Patient dequeue() {
        if (!isEmpty()) {
            Patient p = queue[(head % queue.length)];
            queue[(head % queue.length)] = null;
            head = head + 1;
            return p;
        }
        return null;
    }

    public boolean isEmpty() {
        return tail - head == 0;
    }

    public boolean isFull() {
        return queue.length == tail - head;
    }

    public int getCurrentSize() {
        return tail - head;
    }
}
