package csu.csci325;

/**
 * Created by tweekley on 3/22/16
 */
public class LinkedListStack<T> implements Stack<T> {
    private Node mHead;
    private class Node {
        T mData;
        Node mNext;
        public Node(T data, Node next){
            mData = data;
            mNext = next;
        }
    }
    public LinkedListStack() {
        mHead = null;
    }

    public void push(T element) {
        Node node = new Node(element, mHead);
        mHead = node;
    }

    public T pop() {
        if (mHead == null) {
            return null;
        }
        Node ret = mHead;
        mHead = mHead.mNext;
        return ret.mData;
    }


    public T peek() {
        if (mHead == null) {
            return null;
        }
        return mHead.mData;
    }


    public boolean isEmpty() {
        if (size() == 0)
        return true;
        else
            return false;
    }


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
        String ret = "[";
        Node rover = mHead;
        while (rover != null) {
            ret += " " + rover.mData.toString();
            rover = rover.mNext;
        }
        /* Array base implementation
        for (int i = 0; i < mTop; i++) {
            ret += " " + mArray[i].toString();
        }
        */
        return ret + "]";
    }
    public static void main(String[] args) {
        Stack<Integer> iStack = new LinkedListStack<Integer>();
        for (int i = 0; i < 100; i ++) {
            iStack.push(i);
        }
        System.out.println(iStack.size());

    }
}
