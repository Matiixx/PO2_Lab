public class Node<T> {
    private final Node<T> prev;
    private final T value;

    Node(Node<T> prevNode, T val) {
        prev = prevNode;
        value = val;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getPrev() {
        return prev;
    }
}
