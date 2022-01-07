class MyQueue {
    public int front,rear,size;
    public static int arr[];

    MyQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1)
            return true;
        else if (front == rear + 1)
            return true;
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            ;
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = element;
        }
    }

    public void deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("");
            ;
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println(element);
        }
    }

}

public class myQueue {

    public static void main(String[] args) {
        MyQueue que = new MyQueue(5);
        que.enQueue(100);
        que.enQueue(200);
        que.enQueue(300);
        

    }
}
