package chapter15.hl_trees;

public class BinaryTree {

    private Node root; // a memory pointer to the very first node
    
    public BinaryTree(int value) {
        root = new Node(null, value);
    }

    public Node getRoot() {
        return root;
    }

    /**
     * LVR
     * 1. Go left, as left as you can. (Recursive Case)
     * 2. Visit the node (Smallest Action)
     * 3. Go right, and start from step 1. (Recursive Case)
     * 4. No steps are performed if the node is already visited. (Base Case)
     */
    public void inOrderTraversal(Node node, boolean verbose) {
        // We have to start from somewhere...
        if (node == null) {
            node = this.root;
        }
           
        // Base Case
        if (node.isVisited()) {
            return;
        }

        /* Recur on the left as much as you can */
        if (node.getLeftChild() != null) {
            inOrderTraversal(node.getLeftChild(), verbose); // Recursive Case
        }
        
        // visit the current node
        node.visit(verbose);
        
        /* Recur on the right */
        if (node.getRightChild() != null) {
            inOrderTraversal(node.getRightChild(), verbose);
        }
    }
}
