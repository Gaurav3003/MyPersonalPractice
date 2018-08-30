package com.ds.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    //Add new node to tree
    private Node addNewNodeRecursively(Node currentNode,int value){
        if(currentNode==null){
            currentNode = new Node(value);
            return currentNode;
        }

        if(value<currentNode.value){
            currentNode.leftNode = addNewNodeRecursively(currentNode.leftNode,value);
        }else if(value>currentNode.value){
            currentNode.rightNode = addNewNodeRecursively(currentNode.rightNode,value);
        }else{
            return currentNode;
        }
        return currentNode;
    }

    public void addNode(int value){
        root = addNewNodeRecursively(root,value);
    }

    //find an element present in tree
    private boolean findElementRecursively(Node currentNode, int value){
        if(currentNode==null){
            return  false;
        }
        if(currentNode.value==value){
            return true;
        }
        if(value<currentNode.value){
            return findElementRecursively(currentNode.leftNode,value);
        }else{
            return findElementRecursively(currentNode.rightNode,value);
        }
    }

    public boolean containsNode(int value){
        return findElementRecursively(root,value);
    }

    private Node deleteRecursively(Node currentNode,int value){
        if(currentNode==null){
            return null;
        }
        if(value==currentNode.value){
            //todo
            //Node has no child
            if(currentNode.leftNode==null && currentNode.rightNode==null){
                return null;
            }
            if(currentNode.rightNode==null){
                return currentNode.leftNode;
            }
            if(currentNode.leftNode==null){
                return currentNode.rightNode;
            }

        }
        if(value<currentNode.value){
            currentNode.leftNode = deleteRecursively(currentNode.leftNode,value);
            return currentNode;
        }
        currentNode.rightNode = deleteRecursively(currentNode.rightNode,value);
        return currentNode;
    }

    /*
    Depth-First Search
    In-Order - Left Root Right
     */
    public void traverseInorder(Node node){
        if(node != null){
            traverseInorder(node.leftNode);
            System.out.print(" "+node.value);
            traverseInorder(node.rightNode);
        }
    }

    /*
    Depth-First Search
    Pre-Order - Root Left Right
     */
    public void traversePreorder(Node node){

        if(node != null){
            System.out.print(" "+node.value);
            traversePreorder(node.leftNode);
            traversePreorder(node.rightNode);
        }
    }

    /*
    Depth-First Search
    Post-Order -  Left Right Root
     */
    public void traversePostorder(Node node){

        if(node != null){


            traversePostorder(node.leftNode);
            traversePostorder(node.rightNode);
            System.out.print(" "+node.value);
        }
    }

    /*
    Breadth-First Search
    Level-Order -  traverse all nodes from one level then go to next level
     */
    public void traverseLevelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
           Node node =  nodes.remove();
            System.out.print(" "+node.value);

            if(node.leftNode!=null){
                nodes.add(node.leftNode);
            }

            if(node.rightNode!=null){
                nodes.add(node.rightNode);
            }
        }

    }
}
