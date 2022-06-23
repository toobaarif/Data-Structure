package com.company;

public class A18_Trees {

    //    single tree node class
    static class Node{
        int data;
        Node left;
        Node right;

        //    constructor
        Node(int data){
            this.data = data;

            this.left = null;
            this.right = null;
        }
    }



    //    binary tree claas
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if (nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }



    //      traversal tree by preorder  --> root, left, right
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    //    traversal tree by inorder : root is in mid between left and right node --> left, root, right
//    4, 2, 5, 1, 3 6
    public static  void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }


    //    traversal tree by postorder --> left, right, root
//      4, 5, 2, 6, 3, 1
    public static void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }


    public static void main(String[] args) {
//        Built a tree of numbers with left and right child
        int node [] = {1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, 7, -1, -1};

        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(node);

//        System.out.println(root.data);
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();


        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
//
        System.out.print("Postorder Traversal: ");
        postorder(root);


    }
}











