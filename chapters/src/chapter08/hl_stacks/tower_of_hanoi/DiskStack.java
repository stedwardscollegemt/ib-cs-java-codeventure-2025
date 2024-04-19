package chapter08.hl_stacks.tower_of_hanoi;

public class DiskStack {
    
    /**
     * --- Attributes (State) -----------------------------
     */
    int size = 3; 

    Disk[] tower = new Disk[size];

    int count; // this is the stack attribute that keeps track of the top pointer

    public DiskStack(int size) {
        if (size > this.size) {
            this.size = size;
        }
    }

    /**
     * --- Methods (Behaviour) -----------------------------
     */
    public boolean isEmpty() {
        boolean isEmpty = (count == 0);
        return isEmpty;
    }

    public boolean isFull() {
        return count == size;
    }

    public Disk pop() {
        if(!isEmpty()) {
            Disk topDisk = tower[count - 1];
            tower[count - 1] = null;
            count--;
            return topDisk;
        }
        return null;
    }

    public Disk peek() {
        if(!isEmpty()) {
            Disk topDisk = tower[count - 1];
            return topDisk;
        }
        return null;
    }

    public void push(Disk disk) {
        if (!isFull()) {
            // we can ahead and peek
            Disk topDisk = peek();
            if (topDisk == null || topDisk.size > disk.size) {
                tower[count] = disk;
                count++;
            }
        }
    }
}
