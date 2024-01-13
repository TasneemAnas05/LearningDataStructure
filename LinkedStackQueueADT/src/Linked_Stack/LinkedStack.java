package Linked_Stack;

public class LinkedStack<T> implements UnboundedStackInterface<T> {

    // reference to the top of this stack
    protected LLNode<T> top;

    public LinkedStack() {
        top = null;
    }

    // Places element at the top of this stack.
    public void push(T element) {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }

    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    public void pop() {
        if (!isEmpty()) {
            top = top.getLink();
        } else {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        }
    }

    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.
    public T top() {
        if (!isEmpty()) {
            return top.getInfo();
        } else {
            throw new StackUnderflowException("Top attempted on an empty stack.");
        }
    }

    // Returns true if this stack is empty, otherwise returns false.
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    public void dup() {
        LLNode<T> r = new LLNode<>(top.getInfo());
        r.setLink(top);
        top = r;
    }

}
