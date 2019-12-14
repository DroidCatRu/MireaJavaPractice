package com.droidcatru.Practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private ConcurrentLinkedQueue<E> boundedWaitList;
    private int capacity;

    BoundedWaitList(int capacity) {
        boundedWaitList = new ConcurrentLinkedQueue<>();
        this.capacity = capacity;

    }

    int getCapacity() {
        return capacity;
    }

    boolean isFull() {
        if (boundedWaitList.size() == capacity)
            return true;
        else
            return false;
    }

    @Override
    public void add(E element) {
        if (!isFull())
            boundedWaitList.add(element);
        else
            System.out.println("List is full. You can't add item.");
    }

    public void outputList() {
        for (E element : boundedWaitList) {
            System.out.print(element + " ");
        }
    }
}
