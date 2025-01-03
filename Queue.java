class Queue{
    int rear =-1;
    int front =-1;
    int size = 5;
    int queue[] = new int[size];
    
    
    public boolean isFull(){
       return rear == size-1;
    }
    
    public boolean isEmpty(){
        return front == -1 || front > rear;
    }
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full.");
        }else{
            
            if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = data;
        }
        
        
    }
    
    public int dequeue(){
        
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        
        int deletedValue = queue[front];
        front++;
        
         if (front > rear) { 
            front = -1;
            rear = -1;
        }
        
        return deletedValue;
        
    }
    
    public void display(){
        if(isEmpty()){
             System.out.println("Queue is empty.");
        }else{
            for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        }
    }
    
    
}

class Main{
    public static void main(String[] args){
        Queue list = new Queue();
        
        System.out.println(list.isEmpty());
        
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        
        System.out.println(list.isFull());
        
    
        list.display();
        
        
        list.dequeue();
        
        System.out.println(list.isFull());
        System.out.println();
        
        list.display();
        
    }
}
