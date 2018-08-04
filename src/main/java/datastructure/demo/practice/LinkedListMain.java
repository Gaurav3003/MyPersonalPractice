package datastructure.demo.practice;

public class LinkedListMain {

    public static void main(String args[])throws Exception{
        /*SingleLinkedList list = new SingleLinkedList();
        list.insertNodeAtLast(1);
        list.insertNodeAtLast(2);
        list.insertNodeAtLast(3);
        list.insertNodeAtLast(4);
        //list.insertAtFirst(10);

        list.show();

        System.out.println("Middle element : "+list.getMiddleElement());
        System.out.println("2nd element : "+list.getNthNode(2));*/
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insertNodeAtLast(1);
        linkedList.insertNodeAtLast(2);
        linkedList.insertNodeAtLast(3);
        linkedList.insertNodeAtLast(4);
        linkedList.insertNodeAtLast(5);

        linkedList.headNode.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(linkedList.headNode.getNextNode().getNextNode());

        System.out.print(linkedList.detectLoopInLinkedList(linkedList.headNode));

    }
}
