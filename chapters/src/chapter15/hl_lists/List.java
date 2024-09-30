package chapter15.hl_lists;

public class List {
    /**
     * -------- Data (Attributes) --------------------------
     */
    int size;

    int count;

    ListItem[] staticList;

    /**
     * -------- Constructor --------------------------
     */
    public List(int sizeIn) {
        size = sizeIn;
        staticList = new ListItem[size];
        count = 0;
    }

    /**
     * -------- Methods (Behaviour) --------------------------
     */
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public String add(String id) {
        // check if count is equal to size
        if(isFull()) {
            return "[Error] List is full.";
        }
        // TODO: check if the id is unique
    }

    public String removeById(String id) {
        // check if it is empty
        if(isEmpty()) {
            return "[Error] List is empty.";
        }
        // perform binary search on staticList

    }

    public ListItem binarySearch(String id) {
        // TODO: binary search algorithm
        return null;
    }
}
