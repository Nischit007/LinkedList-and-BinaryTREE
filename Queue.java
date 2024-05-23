class Node{
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkQueue{
    private Node front;
    private Node rear;
 
    public LinkQueue() {
        this.front=null;
        this.rear=null;
    }
  public  void enQueue(int data){
        Node newNode =new Node(data);
        if(rear==null){
            front=rear=newNode;

        }else{
        rear.next=newNode;
        rear=newNode;
     
        }

    }
    Boolean isEmpty(){
        return front==null;
    }
    int deQueue(){
        if(isEmpty()){
            System.out.println("Jar is empty");
            return 0;
        }else{
            int result=front.data;
            front=front.next;
            return result;
        }
    }
   
    void display(){
        Node currNode = front;
        while (currNode != null) {
            System.out.println(currNode.data); // Print data, not the reference
            currNode = currNode.next;
        }
    }
    }




public class Queue{
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.deQueue();
        queue.display();
        

        
     
    }

}