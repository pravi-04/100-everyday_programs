import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class demo{
    Node head = null;
    Node tail = null;
    void insertAtEnd(int data){
        Node newnode = new Node(data);

        if (head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }

    }

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
            if (current!=null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
}

public class addlinkedlist {

    public int addlist(demo list1,demo list2){
        Node temp1=list1.head;
        Node temp2=list2.head;
        int carry =0;


        while (temp1!=null && temp2!=null){
            int sum=carry;
            

            if (temp1!=null){
                 sum+=temp1.data;
                temp1=temp1.next;
            }
            if (temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;

            }
        }
        Node newnode = new Node(sum%10);
        current.next = newnode;
        current =newnode;
        carry=sum/10;

        if (carry>0){
            Node newnode = new Node(sum%10);
        current.next = newnode;
        current =newnode;

        }
    }
    public static void main(String[] args){
        demo list1 = new demo();
        demo list2 = new demo();
        demo result = new demo();
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int data1 = sc.nextInt();
            list1.insertAtEnd(data1);
        }

        for(int i=0;i<n;i++){
            int data2 = sc.nextInt();
            list2.insertAtEnd(data2);
        }





        


    
}

}

    
