package demo.practice.honeywell;
/*
Given a root of tree and any two nodes check whether they are sibling or not?

Ex-
In above tree (3,5),(7,8),(1,3) are sibling except this none of the pairs are sibling

 */
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class SiblingNodesProblem {

    private Node root;

    public static boolean isSiblings(Node root, Node x, Node y){
        if(root==null){
            return false;
        }
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if(root.left!=null && root.right!=null){
            a = ((root.left.data == x.data && root.right.data == y.data) ||
                    (root.left.data == y.data && root.right.data == x.data));
        }
        if(root.left!=null){
            b = isSiblings(root.left,x,y);
        }
        if(root.right!=null){
            c = isSiblings(root.right,x,y);
        }
        return(a || b || c);
    }

    public static void main(String []args){
        SiblingNodesProblem tree = new SiblingNodesProblem();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        Node Node1, Node2;
        Node1 = tree.root.left.left;
        Node2 = tree.root.left.right;

        System.out.println(isSiblings(tree.root,Node1,Node2));
    }

}
