package csu.csci325;

/**
 * Created by student on 3/24/16.
 */
public class LinkedListQueue<T> implements Queue<T> {
    private class Node {
        T mData;
        Node mNext;
        public Node(T data, Node next) {
            mData = data;
            mNext = next;
        }
    }
    private Node mHead, mTail;
    public LinkedListQueue() {mHead = mTail = null;}
    @Override
    public void enqueue(T element) {
        if (mHead == null) {
            mHead = new Node(element, mTail);
            mTail = mHead;
        } else {
            Node node = new Node(element, null);
            mTail = mTail.mNext = node;
        }
    }

    @Override
    public T dequeue() {
        if (mHead == null) {
            return null;
        }
        Node node = mHead;
        mHead = mHead.mNext;
        return node.mData;
    }

    @Override
    public T first() {
        return mHead.mData;
    }

    @Override
    public boolean isEmpty() {
        if (size() ==0)
            return true;
        else
            return false;
    }

    @Override
    public int size() {
        int size = 0;

        if (mHead == null)
            return size;

        for (Node n = mHead; n.mNext != null; n = n.mNext){
            size++;
        }
        return size + 1;
    }

    public String toString() {
        String ret = "";
        Node rover = mHead;
        while (rover != null) {
            ret += " " + rover.mData;
            rover = rover.mNext;
        }
        return ret;
    }

    public Queue<T> getCopy() {
        Queue<T> ret = new LinkedListQueue<>();
        Node rover = mHead;
        while (rover != null) {
            ret.enqueue(rover.mData);
            rover = rover.mNext;
        }
        return ret;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedListQueue<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(queue.dequeue());
            System.out.println(queue);
            queue.dequeue();
        }
        System.out.println(queue.dequeue());
    }
}
