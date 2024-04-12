package chapter08.hl_stacks.pancakes;

/**
 * 5.1.10 Arrays as static stacks
 * "As with any abstract data type, 
 *  a stack can be implemented with a variety of data structures, 
 *  such as a linked list or an array. A stack has a variety of applications 
 *  such as in reversing the order of elements, evaluating polish strings, etc."
 * https://brilliant.org/wiki/stacks/
 */
public class PancakeStack {
    
    /**
     * --- Attributes (State) -----------------------------
     */
    final int SIZE = 5; 

    Pancake[] stack = new Pancake[SIZE];

    int count; // this is the stack attribute that keeps track of the top pointer

    String topping; // this is a pancake attribute

    public PancakeStack(String topping) {
        this.topping = topping;
        this.count = 0;
    }

    /**
     * --- Methods (Behaviour) -----------------------------
     */
    public void push(Pancake p) {
        // first, we check if it is full, if not, then we can push
        if (!isFull()) {
            stack[count] = p;
            count++;
        }
    }

    public Pancake pop() {
        if(!isEmpty()) {
            Pancake topPancake = stack[count - 1];
            stack[count - 1] = null;
            count--;
            return topPancake;
        }
        return null;
    } 
    
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == SIZE;
    }
}
