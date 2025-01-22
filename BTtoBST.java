/* 
    Convert a Binary tree into Binary Search Tree.
*/

import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class BTtoBST {
    
    // Inorder traversal to store the nodes in a vector
    static void inorder(Node root, ArrayList<Integer> nodes) {
        if (root == null) {
            return;
        }
        inorder(root.left, nodes);
        nodes.add(root.data);
        inorder(root.right, nodes);
    }

    // Inorder traversal to convert tree to BST.
    static void constructBST(Node root, ArrayList<Integer> nodes, int[] index) {
        if (root == null) return;

        constructBST(root.left, nodes, index);

        // Update root value
        root.data = nodes.get(index[0]);
        index[0]++;

        constructBST(root.right, nodes, index);
    }

    // Function to convert a binary tree to a binary search tree
    static Node binaryTreeToBST(Node root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);

        // sort the nodes
        Collections.sort(nodes);

        int[] index = {0};
        constructBST(root, nodes, index);
        return root;
    }

    // Function to print the inorder traversal of a binary tree
    static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        
        // Creating the tree
        //         10
        //        /  \
        //       2    7
        //      / \
        //     8   4
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(4);

        Node ans = binaryTreeToBST(root);
        printInorder(ans);
    }
}