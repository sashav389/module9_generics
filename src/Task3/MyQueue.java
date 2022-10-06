package Task3;

import Node.Node;


public class MyQueue<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public void add(E value){
        final Node<E> lastNode = last;
        final Node<E> newNode = new Node<E>(lastNode, value, null);
        last = newNode;
        if (lastNode == null)
            first = newNode;
        else
            lastNode.setNext(newNode);
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
        for (Node<E> currentNode = first; currentNode != null; ) {
            Node<E> nextNode = currentNode.getNext();
            currentNode.setItem(null);
            currentNode.setNext(null);
            currentNode.setPrev(null);
            currentNode = nextNode;
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
        Node<E> firstNode = first;
        return unlinkFirst(firstNode);
    }

    private E unlinkFirst(Node<E> firstNode) {
        final E element = firstNode.getItem();
        final Node<E> next = firstNode.getNext();
        firstNode.setItem(null);
        firstNode.setNext(null);
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
