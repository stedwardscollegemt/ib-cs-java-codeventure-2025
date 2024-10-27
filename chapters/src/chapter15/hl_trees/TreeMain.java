package chapter15.hl_trees;

public class TreeMain {
    
    public static void main(String[] args) {
        
        BinaryTree myNumberTree = new BinaryTree(17);

        myNumberTree.getRoot().setRightChild(22);
        myNumberTree.getRoot().setLeftChild(12);
        myNumberTree.getRoot().getLeftChild().setRightChild(14);
        myNumberTree.getRoot().getRightChild().setLeftChild(21);

        myNumberTree.inOrderTraversal(myNumberTree.getRoot(), true);
    }
}
