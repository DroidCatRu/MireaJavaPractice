package com.droidcatru;

public class MovableRectangle implements Movable {

    private MovablePoint TopLeft;
    private MovablePoint BottomRight;

    public MovableRectangle(double x1, double y1, double x2, double y2, double xSpeed, double ySpeed) {
        this.TopLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.BottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void MoveUp() {
        this.TopLeft.Y++;
        this.BottomRight.Y++;
    }

    public void MoveDown() {
        this.TopLeft.Y--;
        this.BottomRight.Y--;
    }

    public void MoveLeft() {
        this.TopLeft.X--;
        this.BottomRight.X--;
    }

    public void MoveRight() {
        this.TopLeft.X++;
        this.BottomRight.X++;
    }

    public boolean isSpeedRight() {
        return ((TopLeft.XSpeed == BottomRight.XSpeed) && (TopLeft.YSpeed == BottomRight.YSpeed));
    }

    @Override
    public String toString() {
        return "top left corner: " + this.TopLeft.toString() + " bottom right corner: " + this.BottomRight.toString();
    }
}
