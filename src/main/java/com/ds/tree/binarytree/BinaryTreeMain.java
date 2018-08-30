package com.ds.tree.binarytree;

public class BinaryTreeMain {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.addNode(6);
        tree.addNode(4);
        tree.addNode(8);
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(7);
        tree.addNode(9);

        System.out.println(tree.containsNode(7));
        System.out.println(tree.containsNode(10));
        System.out.println("In Order:");
        tree.traverseInorder(tree.root);
        System.out.println();
        System.out.println("Pre Order:");
        tree.traversePreorder(tree.root);
        System.out.println();
        System.out.println("Post Order:");
        tree.traversePostorder(tree.root);
        System.out.println();
        System.out.println("Level Order:");
        tree.traverseLevelorder(tree.root);
    }
}
