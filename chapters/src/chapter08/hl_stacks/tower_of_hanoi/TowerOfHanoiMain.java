package chapter08.hl_stacks.tower_of_hanoi;

public class TowerOfHanoiMain {
    
    // --- Global towers ----------------------------------
    static DiskStack towerA;
    
    static DiskStack towerB;
    
    static DiskStack towerC;

    public static void main(String[] args) {
        // TODO: Welcome title

        // TODO: Ask the user for number of disks

        init(5);
    }

    public static void init(int numDisks) {
        towerA = new DiskStack(numDisks);
        towerB = new DiskStack(numDisks);
        towerC = new DiskStack(numDisks);
        for (int i = numDisks; i > 0; i--) {
            Disk disk = new Disk(i);
            towerA.push(disk);
        }
    }
}
