package com.droidcatru;

public class Main {

    public static void main(String[] args) {
        MovableCircle mySweetCircle = new MovableCircle(0, 0, 0, 1, 4);

        System.out.println(mySweetCircle);
        mySweetCircle.MoveUp();
        System.out.println(mySweetCircle);

        MovableRectangle myCaramelRectangle = new MovableRectangle(0,0,3,3, 2, 1);
        System.out.println(myCaramelRectangle);
        System.out.println("Are points speeds equal? " + myCaramelRectangle.isSpeedRight());
    }
}
