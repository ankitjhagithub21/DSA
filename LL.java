class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LL{
    Node head;
    
    void insertAtFirst(int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        
    }
    
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        
        if(head==null){
            head = newNode;
        }else{
            Node temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
            
            temp.next = newNode;
        }
        
    }
    
    void print(){
        if(head == null){
            System.out.print("List is empty.");
        }else{
            Node temp = head;
            
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    
    void insertAt(int data,int index){
       
        
        if(index ==0){
            insertAtFirst(data);
        }else{
             Node newNode = new Node(data);
            Node temp = head;
            int currIndex = 0;
            
            while(currIndex != index-1){
                temp = temp.next;
                currIndex++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
        
    }
    
    void deleteFromFirst(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head = head.next;
        }
    }
    
    void deleteFromLast(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            Node ptr = temp.next;
            while(ptr.next != null){
                ptr = ptr.next;
                temp = temp.next;
                
            }
            temp.next = null;
            
        }
    }
    void deleteAt(int index){
        if(head==null){
            System.out.println("List is empty");
        }else{
            if(index ==0 ){
                deleteFromFirst();
            }else{
               int currIndex = 0;
               Node temp = head;
               Node ptr = temp.next;
               while(currIndex != index-1){
                   temp = temp.next;
                   ptr = ptr.next;
                    currIndex++;    
               }
               temp.next = ptr.next;
               ptr.next= null;
            }
            
            
        }
    }
    
    void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null){
      
        next = curr.next;
        
        curr.next = prev;
        prev = curr;
        curr = next;
        head = prev;
            
        }
        
    }
    
}


class Main {
    public static void main(String[] args) {
        LL list = new LL();
        
        list.insertAtFirst(10);
        list.insertAtFirst(5);
        list.insertAtEnd(15);
        list.insertAt(2,0);
        list.insertAt(8,2);
        list.print();
        
       
        list.reverse();
        System.out.println();
        list.print();
    }
}
