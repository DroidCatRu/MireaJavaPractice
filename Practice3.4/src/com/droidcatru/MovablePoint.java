package com.droidcatru;

public class MovablePoint implements Movable {
    public double X;
    public double Y;
    public double XSpeed;
    public double YSpeed;


    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.X = x;
        this.Y = y;
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }

    public void MoveUp() {
        this.Y++;
    }

    public void MoveDown() {
        this.Y--;
    }

    public void MoveLeft() {
        this.X--;
    }

    public void MoveRight() {
        this.X++;
    }

    @Override
    public String toString() {
        return "x: " + this.X + ", y: " + this.Y + ", xSpeed: " + this.XSpeed + ", ySpeed: " + this.YSpeed;
    }
}
