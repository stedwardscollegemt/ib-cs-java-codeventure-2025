package chapter15.hl_trees;

public class Node {

    private Node parent; // this is a memory pointer

    private Node leftChild; // this is a memory pointer

    private Node rightChild; // this is a memory pointer
    
    private int value;

    private boolean isVisited = false;
    
    public Node (Node parentIn, int valueIn) {
        parent = parentIn;
        value = valueIn;
    }

    public boolean isRootNode() {
        return parent == null;
    }

    public boolean isLeafNode() {
        return leftChild == null && rightChild == null;
    }

    public int getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public void setRightChild(int value) {
        // We are creating a new instance, but the instance must
        // have a memory pointer to "this"
        rightChild = new Node(this, value);
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(int value) {
        // We are creating a new instance, but the instance must
        // have a memory pointer to "this"
        leftChild = new Node(this, value);
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void visit(boolean verbose) {
        this.isVisited = true;
        if (verbose) {
            System.out.println("We visited: " + this.getValue());
        }
    }
}
