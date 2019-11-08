package com.droidcatru;

import java.util.Optional;

public class Rectangle extends Shape {
    public double a;
    public double b;

    public Rectangle() {}

    public Rectangle(double a, double b, boolean filled, String background) {
        this.a = a;
        this.b = b;
        this.Filled = filled;
        this.Background = background;
    }

    public Rectangle(double a, boolean filled, String background) {
        this.a = a;
        this.b = a;
        this.Filled = filled;
        this.Background = background;
    }

    public Rectangle(double a, boolean filled) {
        this.a = a;
        this.b = a;
        this.Filled = filled;
    }

    public Rectangle(double a, String background) {
        this.a = a;
        this.b = a;
        this.Background = background;
    }

    public Rectangle(double a, double b, boolean filled) {
        this.a = a;
        this.b = b;
        this.Filled = filled;
    }

    public Rectangle(double a, double b, String background) {
        this.a = a;
        this.b = b;
        this.Background = background;
    }

    public double getArea() {
        return this.a * this.b;
    }

    public double getPerimeter() {
        return (this.a + this.b) * 2;
    }

    @Override
    public String toString() {
        if(a == b) {
            return super.toString() + " and a: " + this.a;
        }
        else {
            return super.toString() + ", a: " + this.a + ", b: " + this.b;
        }
    }
}
