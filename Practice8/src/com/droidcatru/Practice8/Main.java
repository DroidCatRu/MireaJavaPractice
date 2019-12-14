package com.droidcatru.Practice8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WaitList waitList = new WaitList();
        waitList.add(5);
        waitList.add(3);
        waitList.add(4);
        waitList.add(1);
        waitList.add(2);
        waitList.outputList();
        System.out.println();
        System.out.println("Deleted item: " + waitList.remove());
        waitList.outputList();

        System.out.println();
        if(waitList.contains(3))
            System.out.println("Wait list contains item 3");
        else
            System.out.println("Wait list doesn't contain item 3");

        if(waitList.isEmpty())
            System.out.println("Wait list is empty");
        else
            System.out.println("Wait list isn't empty");

        ArrayList<Integer> str = new ArrayList<Integer>();
        str.add(1);
        str.add(2);
        str.add(3);

        if(waitList.containsAll(str))
            System.out.println("Wait list contains all items of collection");
        else
            System.out.println("Wait list doesn't contain all items of collection");
        System.out.println();
        System.out.println();


        BoundedWaitList boundedWaitList = new BoundedWaitList(5);
        System.out.println("Size: " + boundedWaitList.getCapacity());
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);
        boundedWaitList.add(5);
        boundedWaitList.outputList();
        System.out.println();
        boundedWaitList.add(6);
        System.out.println();

        UnfairWaitList unfairWaitList = new UnfairWaitList();
        unfairWaitList.add(8);
        unfairWaitList.add(7);
        unfairWaitList.add(9);
        System.out.println();
        System.out.print("List before transposition: ");
        unfairWaitList.outputList();
        unfairWaitList.moveToBack();
        System.out.println();
        System.out.print("List after transposition: ");
        unfairWaitList.outputList();
    }
}
