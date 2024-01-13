package Linked_Queue;

public class LinkedQueue<T> implements UnboundedQueueInterface<T> {

    protected LLNode<T> front;   // reference to the front of this queue
    protected LLNode<T> rear;    // reference to the rear of this queue

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    // Adds element to the rear of this queue.
    @Override
    public void enqueue(T element) {
        LLNode<T> newNode = new LLNode(element);
        if (rear == null) {
            front = newNode;
        } else {
            rear.setLink(newNode);
        }
        rear = newNode;
    }

    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        } else {
            T element;
            element = front.getInfo();
            front = front.getLink();
            if (front == null) {
                rear = null;
            }
            return element;
        }
    }

    // Returns true if this queue is empty; otherwise, returns false.    
    @Override
    public boolean isEmpty() {
        return front == null;
    }
}
