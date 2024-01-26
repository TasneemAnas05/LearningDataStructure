package doublylinkedlist;


public class DLLNode<T> {

    private DLLNode<T> back;
    private T info;
    private DLLNode<T> front;

    public DLLNode(T info) {
        this.info = info;
        back = null;
        front = null;
    }

    public DLLNode<T> getBack() {
        return back;
    }

    public void setBack(DLLNode<T> back) {
        this.back = back;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public DLLNode<T> getFront() {
        return front;
    }

    public void setFront(DLLNode<T> front) {
        this.front = front;
    }

}
