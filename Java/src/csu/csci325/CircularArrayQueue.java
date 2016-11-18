package csu.csci325;

/**
 * Created by student on 3/24/16.
 */
public class CircularArrayQueue<T> implements Queue<T> {
    private T[] mArray;
    private int mHead, mTail; //mTail points the position after the last element.
    public CircularArrayQueue() {
        mArray = (T[]) new Object[10];
        mHead = mTail = 0;
    }
    @Override
    public void enqueue(T element) {
        if (mHead == mTail && mArray[mHead] != null) {
            expandCapacity();
        }
        mArray[mTail++] = element;
        mTail %= mArray.length;
    }

    private void expandCapacity() {
        //System.out.println("EXPAND CAPACITY!, current capacity is " + mArray.length);
        T[] newArray = (T[]) new Object[2*mArray.length];
        for (int i = 0; i < mArray.length; i++) {
            newArray[i] = mArray[(mHead+i)%mArray.length];
        }
        mHead = 0;
        mTail = mArray.length;
        mArray = newArray;
    }

    @Override
    public T dequeue() {
        if (mArray[mHead] == null) {
            return null;
        }
        int idx = mHead++;
        mHead %= mArray.length;
        T ret = mArray[idx];
        mArray[idx] = null;
        return ret;
    }

    @Override
    public T first() {
        if (mArray[0] == null){return null;}

        return mArray[0];
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int size() {
        int size = 0;
       for (int i = 0; i < mArray.length; i++)
       {
           if (mArray[i] != null){size++;}
       }
        return size;
    }

    public String toString() {
        String ret = "";
        int i;
        if (mTail < mHead) {
            for (i = mHead; i < mArray.length; i++) {
                ret += " " + mArray[i];
            }
            for (i = 0; i < mTail; i++) {
                ret += " " + mArray[i];
            }
        } else {
            for (i = mHead; i < mTail; i++) {
                ret += " " + mArray[i];
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new CircularArrayQueue<>();
        for (int i = 0; i < 7; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 7; i++) {
            //System.out.println(queue.dequeue());
            System.out.println(queue);
            queue.dequeue();
        }
        for (int i = 0; i < 7; i++) {
            queue.enqueue(10 + i);
        }
        for (int i = 0; i < 7; i++) {
            //System.out.println(queue.dequeue());
            System.out.println(queue);
            queue.dequeue();
        }
        for (int i = 0; i < 17; i++) {
            queue.enqueue(100 + i);
        }
        for (int i = 0; i < 17; i++) {
            //System.out.println(queue.dequeue());
            System.out.println(queue);
            queue.dequeue();
        }
        System.out.println(queue.dequeue());
    }
}
