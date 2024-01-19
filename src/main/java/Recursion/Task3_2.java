package Recursion;

public class Task3_2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.inorder();
    }
}

class Node{
    public int key;
    public Node leftTree, rightTree;

    public Node(int value) {
        this.key = value;
        this.leftTree = null;
        this.rightTree = null;
    }
}

class BinaryTree{
    public Node root;

    BinaryTree(){
        this.root = null;
    }

    public void insert(int value){
            root = insertRec(root, value);
    }

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.leftTree = insertRec(root.leftTree, key);
        else if (key > root.key)
            root.rightTree = insertRec(root.rightTree, key);
        return root;
    }
    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.leftTree);
            System.out.print(root.key + " ");
            inorderRec(root.rightTree);
        }
    }
}