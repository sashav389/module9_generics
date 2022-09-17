package Task3;

import Node.Node;


public class MyQueue<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public void add(E value){
        final Node<E> l = last;
        final Node<E> newNode = new Node<E>(l, value, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.setNext(newNode);
        size++;
    }

    public void remove(int index){
        if(index<size && index>=0) {
            Node<E> x = first;
            for(int i = 0; i < index; i++){
                x = x.getNext();
            }
            x.unlink();
            size--;
        }
        else System.out.println("Wrong index.");
    }

    public void clear(){
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.getNext();
            x.setItem(null);
            x.setNext(null);
            x.setPrev(null);
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public E peek(){
        return first.getItem();
    }

    public E poll(){
        Node<E> x = first;
        return unlinkFirst(x);
    }

    private E unlinkFirst(Node<E> f) {
        final E element = f.getItem();
        final Node<E> next = f.getNext();
        f.setItem(null);
        f.setNext(null);
        first = next;
        if (next == null)
            last = null;
        else
            next.setPrev(null);
        return element;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (Node<E> x = first; x != null; x = x.getNext()) {
            str.append(x.getItem());
            str.append(", ");
        }
        str.append("]");
        return str.toString();
    }

}
