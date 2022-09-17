package Task5;

public class MyHashMap<K, V> {

    int size;
    Node<K, V> head;

    public void put(K key, V value) {
        Node<K, V> temp = head;
        boolean isKeyRepeat = false;
        while(temp != null){
            if(temp.key.equals(key)){
                System.out.println("Repeated key");
                isKeyRepeat = true;
                break;
            }
            temp = temp.next;
        }
        if(!isKeyRepeat) {
            Node<K, V> newNode = new Node<>(key, value);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    public void remove(K key){
        Node<K, V> temp = head;
        while(temp != null){
            if(temp.next.key.equals(key)){
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }
        if(temp == null) System.out.print("Not found");
    }

    public void clear(){
        head = null;
    }

    public int size(){
        return size;
    }

    public V get(K key){
        Node<K, V> temp = head;
        while(temp != null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
        return null;
    }


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        Node<K, V> temp = head;
        while(!(temp == null)){
            str.append(temp.toStringIt());
            temp = temp.next;
        }
        str.append(" ]");
        return str.toString();
    }


}


 class Node<K,V>  {
     public int hash;
     K key;
    V value;
    Node<K,V> next;


    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public  K getKey()        { return key; }
    public  V getValue()      { return value; }
    public  String toStringIt() { return "(" + key + " = " + value + ")"; }

}

