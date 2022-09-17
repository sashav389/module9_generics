package Node;

public class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    public Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {return prev;}

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public void unlink() {
        final Node<E> next = this.getNext();
        final Node<E> prev = this.getPrev();

            prev.setNext(next);
            this.setPrev(null);

            next.setPrev(prev);
            this.setNext(null);

        this.setItem(null);
    }

}
