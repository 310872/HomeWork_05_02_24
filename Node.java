public class Node<E> {
    private E current;
    private Node<E> next;
    private Node<E> prev;

    public Node(E current, Node<E> prev, Node<E> next) {
        this.current = current;
        this.next = next;
        this.prev = prev;
    }

    public E getCurrentElement() {
        return current;
    }
    public void setCurrentElement(E current) {
        this.current = current;
    }
    public Node<E> getNextElement() {
        return next;
    }
    public void setNextElement(Node<E> next) {
        this.next = next;
    }
    public void setPrevElement(Node<E> prev) {
        this.prev = prev;
    }
}
