package com.droidcatru;

public class MovableCircle {

    private MovablePoint Center;
    private double Radius;

    public MovableCircle(double x, double y, double xSpeed, double ySpeed, double radius) {
        this.Center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.Radius = radius;
    }

    public void MoveUp() {
        this.Center.Y++;
    }

    public void MoveDown() {
        this.Center.Y--;
    }

    public void MoveLeft() {
        this.Center.X--;
    }

    public void MoveRight() {
        this.Center.X++;
    }

    @Override
    public String toString() {
        return this.Center.toString() + ", radius: " + this.Radius;
    }
}
