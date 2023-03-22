package linear;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node head;
    private int N;

    public Stack(){
        head = new Node(null,null);
        N = 0;
    }

    private class Node{
        public T item;
        public Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    //true为空
    public boolean isEmpty(){
        return (this == null || N == 0);
    }

    public int size(){
        return N;
    }

    //弹出栈顶元素 后进先出
    public T pop(){
        Node n = head.next;
        if (n != null){
            head.next = head.next.next;
            N--;

            return n.item;
        }
        return null;
    }

    //压栈 先进后出
    public int push (T t){
        //旧队列的第一个元素先进来，往后挪一位
        Node oldNode = head.next;
        //新元素指向先进来的那一个元素
        head.next = new Node(t,oldNode);

        return ++N;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T>{
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            n = n.next;
            return n.item;
        }
    }
}
