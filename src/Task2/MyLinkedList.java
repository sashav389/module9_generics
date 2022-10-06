package Task2;

import Node.Node;

public class MyLinkedList<E> {
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
            Node<E> currentNode = first;
            for(int i = 0; i < index; i++){
                currentNode = currentNode.getNext();
            }
            currentNode.unlink();
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

    public E get(int index){
        if(index<size && index >= 0) {
            Node<E> currentNode = first;
            for(int i = 0; i < index; i++){
                currentNode = currentNode.getNext();
            }
            return currentNode.getItem();
        }
        return null;
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


