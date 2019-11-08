package com.droidcatru;

public class Circle extends Shape {
    public double Radius;

    public Circle() {}

    public Circle(double radius, boolean filled, String background) {
        this.Radius = radius;
        this.Filled = filled;
        this.Background = background;
    }

    public Circle(double radius, boolean filled) {
        this.Radius = radius;
        this.Filled = filled;
    }

    public Circle(double radius, String background) {
        this.Radius = radius;
        this.Background = background;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(this.Radius, 2) * 100) / 100.0;
    }

    public double getPerimeter() {
        return Math.round(2 * Math.PI * this.Radius * 100) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " and has radius " + this.Radius;
    }
}
