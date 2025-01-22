/*
    Design a binary expression tree representation of the following arithmetic expression.
    ((5+2)*(2-1))/(2+9)
    Create a function for the traversal of the expression tree. 
*/

package Assignment_08;

class Node {
    String value;
    Node left, right;


    public Node(String value) {
        this.value = value;
        left = right = null;
    }
}

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);              
        System.out.print(node.value + " ");   
        printInorder(node.right);
    }

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node("/");

        tree.root.left = new Node("*");
        tree.root.right = new Node("+");

        tree.root.left.left = new Node("+");
        tree.root.left.right = new Node("-");

        tree.root.right.left = new Node("2");
        tree.root.right.right = new Node("9");

        tree.root.left.left.left = new Node("5");
        tree.root.left.left.right = new Node("2");

        tree.root.left.right.left = new Node("2");
        tree.root.left.right.right = new Node("1");

        System.out.println("\nInorder Traversal:");
        tree.printInorder(tree.root);
    }
}
