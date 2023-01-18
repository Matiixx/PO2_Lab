import java.util.EmptyStackException;

public class Stack<T> implements StackInterface<T> {
    private int length = 0;
    private Node<T> head = null;

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void push(T x) {
        Node<T> n = new Node<>(head, x);
        head = n;
        length++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (length == 0) throw new EmptyStackException();
        T toReturn = head.getValue();
        head = head.getPrev();
        length--;
        return toReturn;
    }

    @Override
    public T peek() throws EmptyStackException {
        if (length == 0) throw new EmptyStackException();
        return head.getValue();
    }

    @Override
    public int find(T el) {
        if (length == 0) return -1;
        int pos = 0;
        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.getValue() == el) return pos;
            pos++;
            tmp = tmp.getPrev();
        }
        return -1;
    }

    public int getLength() {
        return length;
    }
}
