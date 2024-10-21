package chapter15.hl_trees;

public class BinaryTree {

    private Node root; // a memory pointer to the very first node
    
    public BinaryTree(int value) {
        root = new Node(null, value);
    }

    public Node getRoot() {
        return root;
    }
}
