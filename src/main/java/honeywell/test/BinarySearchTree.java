package honeywell.test;


class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {

    Node root;

    private Node addNewNodeRecursively(Node currentNode,int value){
        if(currentNode==null){
            currentNode = new Node(value);
            return currentNode;
        }
        if(value<currentNode.data){
            currentNode.left = addNewNodeRecursively(currentNode.left,value);
        }else if(value>currentNode.data){
            currentNode.right = addNewNodeRecursively(currentNode.right,value);
        }else{
            return currentNode;
        }
        return currentNode;
    }

    public void addNode(int value){
        root = addNewNodeRecursively(root,value);
    }

    public static Node findLCA(Node root, Node a, Node b) {
        while(root!=null)
        {
            if(root.data>a.data && root.data > b.data)
            {
                root=root.left;
            }
            else if(root.data < a.data && root.data < b.data)
            {
                root=root.right;
            }
            else
            {
                return root;
            }
        }
        return root;
    }


    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(40);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(25);
        Node node4 = new Node(60);
        Node node5 = new Node(50);
        Node node6 = new Node(55);


        bst.root = root;
        bst.root.left = node1;
        bst.root.left.right=node2;
        bst.root.left.right.left = node3;

        bst.root.right = node4;
        bst.root.right.left = node5;
        bst.root.right.left.right = node6;


        Node lcaNode = findLCA(bst.root,node2,node5);
        System.out.println(lcaNode.data);
        /*
        String input = "";
        String nodes = "";
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader in = new BufferedReader(reader);) {
            input = in.readLine();
            nodes = in.readLine();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            bst.addNode(Integer.parseInt(inputArr[i]));
        }
        String[] inputNodes = nodes.split(" ");

        Node lcaNode = findLCA(bst.root,new Node(Integer.parseInt(inputNodes[0])),new Node(Integer.parseInt(inputNodes[1])));
        System.out.println(lcaNode.data);
         */

    }

}
