
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class Stack{
    Node top;

    public void push(int data){
        
       Node node = new Node(data);
        
        if(top == null){
            top = node;
        }else{
            node.next = top;
            top = node;
        }        
        
    }
    
    public int pop(){
        int popedValue = top.data;
        top = top.next;
        return popedValue;
    }
    
    
    public void display(){
       
       Node temp = top;
       
       while(temp!= null){
           System.out.println(temp.data);
           temp = temp.next;
       }
       
    }
    
    
    
    public int peek(){
        return top.data;
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
     
     
    
     
    }
}
