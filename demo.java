import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node previous;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }


}

class Doublelinkedlist {
    Node head = null;
    Node tail = null;
    


    void insertAtbeginning(int data){
        Node newnode = new Node(data);

        if (head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
        
        
    }

    void insertAtEnd(int data){
        Node newnode = new Node(data);

        if (head==null){
            head=tail=newnode;
        }
        else{
            newnode.previous=tail;
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

public class demo{
    public static void main(String[] args){
        Doublelinkedlist list = new Doublelinkedlist();
        Scanner sc = new Scanner (System.in);
    
        while (true) {
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data1 = sc.nextInt();
                    list.insertAtbeginning(data1);
                    break;
                case 2:
                    System.out.print("Enter the data: ");
                    int data2 = sc.nextInt();
                    list.insertAtEnd(data2);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
    
}
