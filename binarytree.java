import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class binarytree {
    public static Node create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(data == -1) return null;
        Node newnode = new Node(data);
        System.out.println("Enter the data for left child : ");
        newnode.left = create();
        System.out.println("Enter the data for right child : ");
        newnode.right = create();
        return newnode;
    }

    static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    public static void main (String args[]){
        // binarytree tree = new binarytree();
        Node root = create();
        inorder(root);
        preorder(root);
        postorder(root);

    }
    

}
