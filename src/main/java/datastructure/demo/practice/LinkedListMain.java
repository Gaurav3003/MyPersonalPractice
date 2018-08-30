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
        System.out.println("2nd element : "+list.getNthNode(2));*//*
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insertNodeAtLast(1);
        linkedList.insertNodeAtLast(2);
        linkedList.insertNodeAtLast(3);
        linkedList.insertNodeAtLast(4);
        linkedList.insertNodeAtLast(5);

        linkedList.headNode.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(linkedList.headNode.getNextNode().getNextNode());

        System.out.print(linkedList.detectLoopInLinkedList(linkedList.headNode));*/


        addTwoNumberUsingLinkedList(123,4567);

    }


    public static void addTwoNumberUsingLinkedList(int num1,int num2){
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();

        while(num1!=0){
            int rem = num1%10;
            list1.insertNodeAtLast(rem);
            num1 = num1/10;
        }
        while(num2!=0){
            int rem = num2%10;
            list2.insertNodeAtLast(rem);
            num2 = num2/10;
        }

        SingleLinkedList root = new SingleLinkedList();
        int carry = 0;

        Node node1 = list1.headNode;
        Node node2 = list2.headNode;

        while(node1!=null || node2!=null || carry>0){
            int value1 = node1 == null? 0 : node1.getValue();
            int value2 = node2 == null? 0 : node2.getValue();
            int sum = value1+value2+carry;
            int digit = sum%10;
            carry = sum/10;

            root.insertAtFirst(digit);

            node1 = node1!=null?node1.getNextNode():null;
            node2 = node2!=null?node2.getNextNode():null;

        }
        System.out.println();
        root.show();

    }
}
