package chapter08.hl_queues;

public class WaitingRoom {

    static PatientQueue patientQueue = new PatientQueue();
    
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // code goes here.
            }
        });  
        t1.start();
        
    }
}
