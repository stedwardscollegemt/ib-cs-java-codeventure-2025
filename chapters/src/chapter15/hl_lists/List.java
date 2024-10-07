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

    /**
     * This add implements the insertion sort which is a famous
     * sorting algorithm for sorting elements in an array.
     */
    public String add(String id) {
        // check if count is equal to size
        if(isFull()) {
            return "[Error] List is full.";
        }

        if (!isEmpty()) {
            // check if the id is unique
            boolean isUnique = true;
            for (int i = 0; i < count; i++) {
                if (staticList[i] != null && staticList[i].id.equals(id)) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) {
                return "[Error] An item with id " + id + " already exists."; 
            }
        }

        // Create the ListItem object
        ListItem item = new ListItem(id);

        // Start from the last item
        int pos = count - 1;

        // Find position for the new elements
        while (pos >= 0 && staticList[pos].id.compareTo(id) > 0) {
            // Shift elements to the right to make space for the new element
            staticList[pos + 1] = staticList[pos];
            pos--;  // Move to the previous element
        }

        // Add to the list
        staticList[pos + 1] = item;
        count++;

        // Update all indices
        for (int i = 0; i < count; i++) {
            staticList[i].index = i;
        }

        return "Ok!";
    }

    public String removeById(String id) {
        // check if it is empty
        if(isEmpty()) {
            return "[Error] List is empty.";
        }
        
        // call binary search on staticList
        ListItem removeItem = binarySearch(id);

        if (removeItem != null) {
            int pos = removeItem.index;
            while(pos < count) {
                staticList[pos] = staticList[pos + 1];
                pos++;
            }
        }

        staticList[count] = null;
        count--;

        // Update all indices
        for (int i = 0; i < count; i++) {
            staticList[i].index = i;
        }

        return "Ok!";
    }

    public ListItem binarySearch(String id) {
        ListItem itemFound = null;

        // Step 1 - Start and End of my array
        int start = 0;
        int end = staticList.length;

        // code for the binary search
        while(start <= end) {
            int mid = (start + end) / 2;
            if (staticList[mid].id.equals(id)) {
                itemFound = staticList[mid];
            } else if (staticList[mid].id.compareTo(id) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return itemFound;
    }
}
