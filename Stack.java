class Stack{
    int top = -1;
    int size=5;
    int arr[] = new int[size];
    

    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == size-1;
    }
    
    public void push(int data){
        
        if(isFull()){
            System.out.println("Stack is overflow");
        }else{
            top++;
            arr[top] = data;
        }
        
        
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
            return -1;
        }
            int deletedElement = arr[top];
            top--;
            return deletedElement;
        

    }
    
    
    public void display(){
        
        if(isEmpty()){
            System.out.println("Stack is empty.");
            
        }else{
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]);
        }
        }
    }
    
    
    
    public int peek(){
        return arr[top];
    }
    
}


class Main{
    public static void main(String[] args){
        Stack stack = new Stack();
     
     stack.push(5);
     stack.push(10);
     stack.push(20);
     
     stack.display();
     
     System.out.println("Poped element:"+stack.pop());
     
     System.out.println(stack.peek());
     
     
     System.out.println(stack.isEmpty());
     System.out.println(stack.isFull());
     
    }
}
