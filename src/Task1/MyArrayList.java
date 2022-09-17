package Task1;

import java.util.Arrays;


public class MyArrayList<E> {
    private E[] arr;

    public MyArrayList(){
        this.arr = (E[]) new Object[0];
    }

    public void add(E value){
        E[] temp = (E[]) new Object[arr.length + 1];
        E x;
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length] = value;
        arr = temp;
    }
    public void remove(int index){
        if(index >= 0 && index < arr.length) {
            E[] temp = (E[]) new Object[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == index) i++;
                temp[j] = arr[i];
                j++;
            }
            arr = temp;
        }
        else System.out.println("Wrong index");
    }
    public void clear() {
        arr = (E[]) new Object[0];
    }
    public int size(){
        return arr.length;
    }

     public E get(int index  ){
        if(index >= 0 && index < arr.length)
            return arr[index];
         System.out.println("Wrong index");
         return null;
     }


    @Override
    public String toString(){
        return Arrays.toString(arr);
    }

}


