class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertElementAtBegining(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertElementAtLast(int data) {
        Node newNode = new Node(data);

        Node currNode = head;
        while (currNode.next != null) {

            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    void insertElementAtMiddle(int data, int position) {
        if(position==1){
            Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        }

        Node newNode = new Node(data);
        
        Node currNode = head;
        int i = 1;
        while (i<position) {
            currNode = currNode.next;
            i++;
        }
        Node nextNode = currNode.next;

        currNode.next = newNode;
        newNode.next = nextNode;
    }

    void deleteAtFirst() {
        head = head.next;

    }
    void deleteAtLast(){
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next=null;
        
    }
    void deleteAtPosition(int position){
        Node currNode = head;
        int i = 1;
        while (i != position - 1) {
            currNode = currNode.next;
            i++;
        }
       currNode.next=currNode.next.next;

    }

    void display() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data); // Print data, not the reference
            currNode = currNode.next;
        }
    }

}

public class Noode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertElementAtBegining(10);
        list.insertElementAtBegining(20);
        list.insertElementAtBegining(30);
        list.display();
        list.insertElementAtLast(100);
        list.insertElementAtLast(200);
        list.display();
        list.insertElementAtMiddle(13, 2);
        list.insertElementAtMiddle(14, 3);
        list.display();
    }
}

// stack and queue

