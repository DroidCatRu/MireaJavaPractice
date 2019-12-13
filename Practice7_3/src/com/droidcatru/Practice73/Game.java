package com.droidcatru.Practice73;

import java.util.*;

public class Game {
    private Deque<Integer> firstPlayer = new ArrayDeque<>();
    private Deque<Integer> secondPlayer = new ArrayDeque<>();

    public Game() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> buff = new Stack<>();
        for (int i = 0; i < 5; i++) {
            firstPlayer.addFirst(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            secondPlayer.addFirst(scanner.nextInt());
        }
    }

    public void getResults() {
        int step = 0;
        while(step < 106 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            if(firstPlayer.peek() == 9 && secondPlayer.peek() == 0) {
                secondPlayer.add(firstPlayer.poll());
                secondPlayer.add(secondPlayer.poll());
            }
            else if((firstPlayer.peek() == 0 && secondPlayer.peek() == 9)) {
                firstPlayer.add(firstPlayer.poll());
                firstPlayer.add(secondPlayer.poll());
            }
            else if (firstPlayer.peek() < secondPlayer.peek()) {
                secondPlayer.add(firstPlayer.poll());
                secondPlayer.add(secondPlayer.poll());
            }
            else if (firstPlayer.peek() > secondPlayer.peek()) {
                firstPlayer.add(firstPlayer.poll());
                firstPlayer.add(secondPlayer.poll());
            }

            ++step;
        }

        if(step == 106) {
            System.out.println("botva");
        }
        else if(firstPlayer.isEmpty()) {
            System.out.println("second " + step);
        }
        else if(secondPlayer.isEmpty()) {
            System.out.println("first " + step);
        }
    }
}
