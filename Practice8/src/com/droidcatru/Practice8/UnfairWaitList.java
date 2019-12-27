package com.droidcatru.Practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    private ConcurrentLinkedQueue<E> unfairWaitList;

    UnfairWaitList(){
        unfairWaitList = new ConcurrentLinkedQueue<>();
    }

    void moveToBack(){
        add(remove());
    }
}

