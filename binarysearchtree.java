class Node{
    int data;
    Node left , right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

class bst{
    Node create(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = create(root.left, val);
        }else if(val > root.data){
            root.right = create(root.right, val);
        }
        return root;
    }
}
public class binarysearchtree {
    public static void main(String args[]){
        int[] arr = {30, 40, 10, 20};
        bst tree = new bst();
        Node root = null;

        for(int i: arr){
            root = tree.create(root, i);
        }
    }
    
}
