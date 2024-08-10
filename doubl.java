import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous=null;
    }
}

class DoubleLinkedList {
    Node head = null;
    Node tail = null;

    public void insertAtbeginning(int data){
        Node newnode = new Node(data);
        
        if (head==null){
            head=tail=newnode;
        }

        else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
            newnode.previous=null;
        }
    }

    // Method to display the linked list
    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class doubl{
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add node");
            System.out.println("2. Display list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data = sc.nextInt();
                    list.insertAtbeginning(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



