package com.droidcatru;

abstract public class Shape {

    public boolean Filled;
    public String Background;

    public Shape() {}

    public Shape(boolean filled, String background) {
        this.Filled = filled;
        this.Background = background;
    }

    public Shape(boolean filled) {
        this.Filled = filled;
    }

    public Shape(String background) {
        this.Background = background;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        if(this.Filled) {
            return "Shape filled with " + this.Background + " color";
        }
        else {
            return "Shape is not filled";
        }
    }
}
