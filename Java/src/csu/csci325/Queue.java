package csu.csci325;

/**
 * Created by student on 3/24/16.
 */
public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T first();
    boolean isEmpty();
    int size();
    String toString();
}
