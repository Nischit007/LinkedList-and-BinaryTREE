// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class Stack1 {
//     private Node top;
    

//     public Stack1() {
//         this.top = null;
//     }

//     public void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     public boolean isEmpty() {
//         return top == null;
//     }

//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Jar is empty");
//             return -1;
//         }
//         return top.data;

//     }


// public void display() {
//     Node current = top;
//     System.out.println("Stack: ");
//     while (current != null) {
//         System.out.println(current.data);
//         current = current.next;
//     }
// }
// }

// public class Stack {
//     public static void main(String[] args) {
//         Stack1 list=new Stack1();
//         list.push(10);
//         list.push(20);
//         list.push(30);
//         list.pop();
//         list.display();

//     }
 

// }




class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack1 {
    private Node top;
    private int length=0;

    public Stack1() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    } 

    public boolean isEmpty() {
        return top == null;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        }
        int poppedData = top.data;
        top = top.next;
        length--;
        return poppedData;
    }

    public void display() {
        Node current = top;
        System.out.println("Stack: ");
        while (length >= 1) {
            System.out.println(current.data);
            current = current.next;
            length--;
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop(); // Remove an element from the stack
        stack.display(); // Display the elements of the stack
    }
}
