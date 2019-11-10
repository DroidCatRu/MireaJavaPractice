package com.droidcatru;

public class Ball {
    public double X;
    public double Y;

    public Ball() {
        this.X = 0;
        this.Y = 0;
    }

    public Ball(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public void move(double difX, double difY) {
        this.X += difX;
        this.Y += difY;
    }

    @Override
    public String toString() {
        return "Ball is at (" + this.X + ", " + this.Y + ")";
    }
}
