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
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            newNode.next = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    void insertAtSpecificPosition(int pos, int data) {

        if (pos == 1) {
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
        while (i != pos - 1) {
            currNode = currNode.next;
            i++;
        }
        Node nextNode = currNode.next;

        currNode.next = newNode;
        newNode.next = nextNode;
    }

}

public class CircularLink {
    public static void main(String[] args) {

    }
}
