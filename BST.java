/*
    2) Convert a given sorted array into Binary Search Tree. 
*/


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    Node root; 

    BST(int key) {
        root = new Node(key);
    }

    BST() {
        root = null;
    }

    Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    void InOrder(Node node) {
        if (node == null)
            return;

        InOrder(node.left);
        System.out.print(node.key + " ");
        InOrder(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        tree.root = tree.sortedArrayToBST(sortedArray, 0, sortedArray.length - 1);

        System.out.println("In-Order Traversal of the BST :");
        tree.InOrder(tree.root);
    }
}
