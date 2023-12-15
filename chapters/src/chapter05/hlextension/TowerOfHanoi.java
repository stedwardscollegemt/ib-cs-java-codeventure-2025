package chapter05.hlextension;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3; // Number of disks
        
        char source = 'A';
        char auxiliary = 'B';
        char destination = 'C';

        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        
        solveHanoi(n, source, auxiliary, destination);
    }

    // recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {
            // todo: move n-1 disks from source to auxiliary
            
            // move the nth disk from source to destination
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            
            // todo: move the n-1 disks from auxiliary to destination
        }
    }
}
