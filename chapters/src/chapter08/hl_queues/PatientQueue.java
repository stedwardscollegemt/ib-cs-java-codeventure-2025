package chapter08.hl_queues;

public class PatientQueue {
    
    // --- Data -------------------------------------------------
    Patient[] queue = new Patient[10];

    final int HEAD = 0;

    int tail = -1;

    // --- Constructor ------------------------------------------


    // --- Methods ----------------------------------------------
    public void enqueue(Patient p) {
        if (!isFull()) {
            tail = tail + 1;
            queue[tail] = p;
        }
    }

    public Patient dequeue() {
        if (!isEmpty()) {
            Patient p = queue[HEAD];
            queue[HEAD] = null;
            for (int i = 0; i < tail; i++) {
                queue[i] = queue[i + 1];
            }
            queue[tail] = null;
            tail = tail - 1;
            return p;
        }
        return null;
    }

    public boolean isFull() {
        return tail == 9;
    }

    public boolean isEmpty() {
        return tail == -1;
    }

}
