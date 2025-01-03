class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}

class Queue{
    Node rear;
    Node front;
    
    public boolean isEmpty(){
        return front == null && rear == null;
    }
    
    public void enqueue(int data){
        Node newNode = new Node(data);
        
        if(isEmpty()){
           front = newNode;
           rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        
    }
    public int dequeue(){
        int item = -1;
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }else{
            item = front.data;
            front = front.next;
            if(front == null){
                rear = null;
            }
        }
        return item;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
                
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        Queue list = new Queue();
        
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
       
       System.out.println(list.dequeue());
        
        list.display();
    }
}
