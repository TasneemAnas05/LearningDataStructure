package doublylinkedlist;

public class DLLNode<T> {

    private T info;
    private DLLNode<T> front;
    private DLLNode<T> back;

    public DLLNode(T info) {
        this.info = info;
        front = null;
        back = null;
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

    public DLLNode<T> getBack() {
        return back;
    }

    public void setBack(DLLNode<T> back) {
        this.back = back;
    }

}
