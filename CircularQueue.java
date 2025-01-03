class CircularQueue {
    int size;
    int front;
    int rear;
    int queue[];

    // Constructor
    CircularQueue(int size) {
        this.size = size;
        queue = new int[size]; // Fixed syntax
        front = -1;
        rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue operation
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        if (isEmpty()) {
            front = 0; // Initialize front for the first element
        }
        rear = (rear + 1) % size; // Circular increment
        queue[rear] = data;
        System.out.println(data + " added to the queue.");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int deletedItem = queue[front];
        if (front == rear) { // If the queue has only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size; // Circular increment
        }
        return deletedItem;
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) { // Stop when the rear is reached
                break;
            }
            i = (i + 1) % size; // Circular increment
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        queue.enqueue(4);
        queue.display();

        queue.enqueue(5); // This should print "Queue is full."
    }
}
