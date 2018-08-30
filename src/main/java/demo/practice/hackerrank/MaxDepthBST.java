package demo.practice.hackerrank;


import java.util.Scanner;

class NodeBST{
    NodeBST left,right;
    int data;
    NodeBST(int data){
        this.data=data;
        left=right=null;
    }
}
public class MaxDepthBST {
    public static NodeBST insert(NodeBST root,int data){
        if(root==null){
            return new NodeBST(data);
        }
        else{
            NodeBST cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeBST root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height-1);
    }

    private static int getHeight(NodeBST root) {

        if(root==null){
            return -1;
        }
       return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
