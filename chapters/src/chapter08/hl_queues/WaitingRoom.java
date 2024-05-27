package chapter08.hl_queues;

public class WaitingRoom {

    static PatientQueue patientQueue = new PatientQueue();

    static boolean isClinicOpen = false; 
    
    public static void main(String[] args) {

        // We are faking real life in a waiting room
        isClinicOpen = true;

        // Thread in Java is another word for process
        Thread doctorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isClinicOpen) {
                    Patient p = patientQueue.dequeue();
                    if (p != null) {
                        System.out.println("The doctor is seeing the next patient.");
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) { }
                }
            }
        });  
        doctorThread.start();

        Thread patientThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isClinicOpen) {
                    Patient p = new Patient();
                    if (!patientQueue.isFull()) {
                        patientQueue.enqueue(p);
                        System.out.println("The patient has entered the queue.");
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) { }
                }
            }
        });  
        patientThread.start();

        // Life at the clinic
        for (int i = 0; i < 50; i++) {
            System.out.println("Life is just passing by... the queue size is " + (patientQueue.tail + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) { }
        }
        isClinicOpen = false;
        System.out.println("The clinic is closed!");    
    }
}
