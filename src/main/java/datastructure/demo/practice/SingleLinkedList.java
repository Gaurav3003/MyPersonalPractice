package datastructure.demo.practice;

public class SingleLinkedList {

    public Node headNode;
    private Node latestNode;
    private int size=0;
    public void insertNodeAtLast(int data){
        Node newNode = new Node();
        newNode.setValue(data);
        newNode.setNextNode(null);

        if(headNode==null){
            headNode = newNode;
            latestNode = headNode;
        }else{
            /*Node nextNode = latestNode;
            while(nextNode.getNextNode()!=null){
                nextNode = nextNode.getNextNode();
            }*/
            latestNode.setNextNode(newNode);
            latestNode = newNode;
        }
        size++;
    }

    public  void insertAt(int data, int index){
        Node newNode = new Node();
        newNode.setValue(data);
        newNode.setNextNode(null);

        if(index==0){
            insertAtFirst(data);
            size++;
            return;
        }
        Node node = headNode;
        for(int i = 0; i<index-1;i++){
            node = node.getNextNode();
        }
        newNode.setNextNode(node.getNextNode());
        node.setNextNode(newNode);
        size++;

    }

    public  void insertAtFirst(int data){
        Node newHead = new Node();
        newHead.setValue(data);
        newHead.setNextNode(headNode);
        headNode = newHead;
        size++;
    }

    public  void deleteNodeAt(int index)throws Exception{
        System.out.println(size);
        if(index>=size){
            throw new Exception("index is greater than size of the list");
        }
        if(index==0 && headNode!=null){
            headNode = headNode.getNextNode();
            size--;
            return;
        }
        Node node = headNode;
        //Node tempNode = null;
        for(int i = 0;i<index-1;i++){
            if(node!=null)
                node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
        size--;

    }

    public  void show(){
        Node node = headNode;
        while(node.getNextNode()!=null){
            System.out.print(node.getValue()+"\t");
            node = node.getNextNode();
        }
        System.out.print(node.getValue()+"\t");
    }

    /*
    Iteratively count  the size of nodes
     */
    public int getSize(){
        int counter = 0;
        Node node = headNode;
        while(node!=null){
            counter++;
            node = node.getNextNode();
        }
        return counter;
    }

    /*
    Recursively count the size of nodes
     */
    private int getCount(Node node){
        if(node==null){
            return 0;
        }
        return 1+getCount(node.getNextNode());
    }

    public int getSizeRecur(){
        return getCount(headNode);
    }

    /*
    Swapping of two nodes in Linked List without swapping the data
    1. either of them is headnode
    2. either of them is last node
    3. both are intermediate node
     */
    public void swapNode(int x, int y){
        if(x==y){
            return;
        }
        Node prevX = null;
        Node currX = headNode;
        while(currX!=null && currX.getValue()!=x){
            prevX = currX;
            currX = currX.getNextNode();
        }

        Node prevY = null;
        Node currY = headNode;
        while(currY!=null && currY.getValue()!=y){
            prevY = currY;
            currY = currY.getNextNode();
        }

        if(currX==null || currY==null){
            return;
        }

        if(prevX!=null){
            prevX.setNextNode(currY);
        }else{
            headNode = currY;
        }

        if(prevY!=null){
            prevY.setNextNode(currX);
        }else{
            headNode = currX;
        }

        Node temp = currX.getNextNode();
        currX.setNextNode(currY.getNextNode());
        currY.setNextNode(temp);
    }


    public int getNthNode(int x){
        int index = 1;
        Node current = headNode;
        while(current!=null){
            if(index==x){
                return current.getValue();
            }
            index++;
            current = current.getNextNode();
        }
        return 0;
    }

    /*
    get middle element of the LinkedList
     */
    public int getMiddleElement(){
        Node fastPointer = headNode;
        Node slowPointer = headNode;
        if(headNode != null){
            while(fastPointer!=null && fastPointer.getNextNode()!=null){
                fastPointer = fastPointer.getNextNode().getNextNode();
                slowPointer = slowPointer.getNextNode();
            }
            return slowPointer.getValue();
        }
        return -1;
    }
    /*
    Detect if loop exist in the linkedlist
     */
    public boolean detectLoopInLinkedList(Node headNode){
        if(headNode==null){
            return false;
        }

        if(headNode!=null && headNode.getNextNode()==null){
            return false;
        }
        Node fastPointer = headNode;
        Node slowPointer = headNode;

        while(slowPointer!=null && fastPointer!=null && fastPointer.getNextNode()!=null ){
            slowPointer = slowPointer.getNextNode();
            fastPointer = fastPointer.getNextNode().getNextNode();
            if(slowPointer==fastPointer){
                Node startOfLoop = detectStartOfLoop(headNode,slowPointer,fastPointer);
                System.out.println(startOfLoop.getValue());
                return true;
            }
        }
        return false;
    }
    /*
    get the starting point of the loop in the linked list if loop present
     */
    private Node detectStartOfLoop(Node headNode, Node slowPointer, Node fastPointer){
        fastPointer = headNode;
        while(slowPointer != null && fastPointer!=null){
            slowPointer = slowPointer.getNextNode();
            fastPointer = fastPointer.getNextNode();

            if(slowPointer==fastPointer){
                breakTheLoop(slowPointer,headNode);
                return slowPointer;
            }
        }
        return null;
    }
    /*
    break the loop in the linked list if loop present
     */
    private void breakTheLoop(Node slowPointer,Node headNode){
        slowPointer.setNextNode(null);
        System.out.println("Loop Broken :: "+detectLoopInLinkedList(headNode));
    }



}
