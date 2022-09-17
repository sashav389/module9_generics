import Task1.MyArrayList;
import Task2.MyLinkedList;
import Task3.MyQueue;
import Task4.MyStack;
import Task5.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(-5);
        arr.add(8);
        arr.add(11);
        System.out.println(arr);
        System.out.println(arr.size() + " size");
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size() + " size");
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.size() + " size");

        System.out.println("-------------------------");

        MyLinkedList<Integer> arr2 = new MyLinkedList<>();
        arr2.add(3);
        arr2.add(5);
        arr2.add(8);
        arr2.add(9);
        arr2.add(12);
        arr2.add(18);
        System.out.println(arr2);
        System.out.println("size is " + arr2.size());
        int x = arr2.get(2);
        System.out.println("Index 2: " + x);
        arr2.remove(2);
        System.out.println(arr2);
        arr2.clear();
        System.out.println(arr2);

        System.out.println("-------------------------");

        MyQueue<Integer> arr3 = new MyQueue<>();
        arr3.add(2);
        arr3.add(5);
        arr3.add(6);
        arr3.add(7);
        arr3.add(9);
        System.out.println(arr3.peek());
        System.out.println(arr3);
        arr3.poll();
        System.out.println(arr3);

        System.out.println("-------------------------");


        MyStack<String> arr4 = new MyStack<>();
        arr4.push("Go");
        arr4.push("to");
        arr4.push("the");
        arr4.push("school");
        arr4.push("quickly");
        System.out.println(arr4);
        System.out.println(arr4.poll());
        System.out.println(arr4);
        System.out.println(arr4.peek());
        System.out.println(arr4);
        arr4.clear();
        System.out.println(arr4);

        System.out.println("-------------------------");

        MyHashMap<Integer, String> arr5 = new MyHashMap<>();
        arr5.put(1, "One");
        arr5.put(3, "Three");
        arr5.put(8, "Goo");
        arr5.put(22, "what");
        arr5.put(15, "next");
        arr5.put(22, "what");
        arr5.put(23, "gg");
        System.out.println(arr5);
        arr5.remove(15);
        System.out.println(arr5);
        System.out.println(arr5.size());
        System.out.println(arr5.get(28));
        arr5.clear();
        System.out.println(arr5);
    }




}