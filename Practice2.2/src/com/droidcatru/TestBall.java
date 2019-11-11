package com.droidcatru;

public class TestBall {

    public static void main(String[] args) {
        Ball mySweetBall1 = new Ball();
        Ball mySweetBall2 = new Ball(3, -1);

        System.out.println(mySweetBall1);
        System.out.println(mySweetBall2);
        System.out.println("Let's move second ball!");
        mySweetBall2.move(1.33, 3.5);
        System.out.println(mySweetBall2);
    }
}
