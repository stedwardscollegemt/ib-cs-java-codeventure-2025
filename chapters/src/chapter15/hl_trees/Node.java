package chapter15.hl_trees;

public class Node {

    private Node parent; // this is a memory pointer

    private Node leftChild; // this is a memory pointer

    private Node rightChild; // this is a memory pointer
    
    private int value;
    
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
        Node rightChild = new Node(this, value);
    }

    public Node getRightChild() {
        return rightChild;
    }
}
