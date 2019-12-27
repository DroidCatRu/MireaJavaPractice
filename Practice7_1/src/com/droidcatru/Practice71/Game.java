package com.droidcatru.Practice71;

import java.util.Scanner;
import java.util.Stack;

public class Game {
    private Stack<Integer> firstPlayer = new Stack<>();
    private Stack<Integer> secondPlayer = new Stack<>();

    public Game() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            firstPlayer.push(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            secondPlayer.push(scanner.nextInt());
        }
    }

    public void getResults() {
        int step = 0;
        while(step < 106 && !firstPlayer.empty() && !secondPlayer.empty()) {
            Stack<Integer> firstBuff = new Stack<>();
            Stack<Integer> secondBuff = new Stack<>();

            Stack<Integer> fB = new Stack<>();
            Stack<Integer> sB = new Stack<>();

            if (firstPlayer.peek() == 9 && secondPlayer.peek() == 0) {
                secondBuff.push(secondPlayer.pop());
                secondBuff.push(firstPlayer.pop());
            }
            else if (firstPlayer.peek() == 0 && secondPlayer.peek() == 9) {
                firstBuff.push(secondPlayer.pop());
                firstBuff.push(firstPlayer.pop());
            }
            else if (firstPlayer.peek() < secondPlayer.peek()) {
                secondBuff.push(secondPlayer.pop());
                secondBuff.push(firstPlayer.pop());
            }
            else if (firstPlayer.peek() > secondPlayer.peek()) {
                firstBuff.push(secondPlayer.pop());
                firstBuff.push(firstPlayer.pop());
            }

            while (!firstPlayer.empty()) {
                fB.push(firstPlayer.pop());
            }

            while (!secondPlayer.empty()) {
                sB.push(secondPlayer.pop());
            }

            while (!firstBuff.empty()) {
                fB.push(firstBuff.pop());
            }

            while (!secondBuff.empty()) {
                sB.push(secondBuff.pop());
            }

            while (!fB.empty()) {
                firstPlayer.push(fB.pop());
            }

            while (!sB.empty()) {
                secondPlayer.push(sB.pop());
            }

            ++step;
        }

        if (step == 106) {
            System.out.println("botva");
        }
        else if (firstPlayer.empty()) {
            System.out.println("second " + step);
        }
        else if (secondPlayer.empty()) {
            System.out.println("first " + step);
        }
    }
}
