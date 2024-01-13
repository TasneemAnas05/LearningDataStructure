package Linked_Stack;

public class LLNode<T> {

    private LLNode<T> link;
    private T info;

    public LLNode(T info) {
        this.info = info;
        link = null;
    }

    // Sets info of this LLNode.
    public void setInfo(T info) {
        this.info = info;
    }

    // Returns info of this LLONode.
    public T getInfo() {
        return info;
    }

    // Sets link of this LLNode.
    public void setLink(LLNode<T> link) {
        this.link = link;
    }

    // Returns link of this LLNode.
    public LLNode<T> getLink() {
        return link;
    }
}
