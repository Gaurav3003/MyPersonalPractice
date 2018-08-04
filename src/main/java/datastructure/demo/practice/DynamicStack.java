package datastructure.demo.practice;

public class DynamicStack {

    private StackNode topNode;
    int size = 0;


    public void push(int data)throws Exception{
        StackNode node = new StackNode();
        node.setData(data);
        node.setNextNode(null);

        if(topNode == null){
            topNode = node;
        }else{
            node.setNextNode(topNode);
            topNode = node;
        }
        size++;

    }

    public int pop(){
        StackNode node = topNode;
        topNode = node.getNextNode();
        int data = node.getData();
        node = null;
        size--;
        return data;
    }

    public int peek(){
        return topNode.getData();
    }
}

class StackNode{
    int data;
    StackNode nextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(StackNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
