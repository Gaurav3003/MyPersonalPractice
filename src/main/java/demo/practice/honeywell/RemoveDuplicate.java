package demo.practice.honeywell;

import datastructure.demo.practice.*;

class LinkedList{
    Node head = null;
    Node latestNode = null;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            latestNode = node;
        }else{
            latestNode.next = node;
            latestNode = node;
        }
    }

    public void removeAllDuplicates(){
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node prevNode = dummyNode;
        Node currentNode = head;
        while (currentNode!=null){
            while(currentNode.next!=null && currentNode.next.data == prevNode.next.data){
                currentNode = currentNode.next;
            }
            if(prevNode.next==currentNode){
                prevNode = prevNode.next;
            }else{
                prevNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }
        head = dummyNode.next;
    }
    public  void show(){
        if(head==null){
            System.out.print("empty");
            return;
        }
       Node node = head;
        while(node.next!=null){
            System.out.print(node.data+"\t");
            node = node.next;
        }
        System.out.print(node.data+"\t");
    }

    public void removeDuplicates(){
        Node currentNode = head;

        if(head==null){
            return;
        }
        while(currentNode.next!=null){
            if(currentNode.data==currentNode.next.data){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
    }
}
public class RemoveDuplicate {
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertAtLast(1);
        /*list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(1);*/
        /*list.insertAtLast();
        list.insertAtLast(4);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(5);
        list.insertAtLast(7);*/

        list.show();
        list.removeAllDuplicates();
        System.out.println();
        list.show();
    }
}
