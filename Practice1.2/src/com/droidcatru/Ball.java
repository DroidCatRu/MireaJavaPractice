package com.droidcatru;

public class Ball {
    public int Size;
    public String Color;

    public Ball() {}

    public Ball(int size) {
        this.Size = size;
    }

    public Ball(String color) {
        this.Color = color;
    }

    public Ball(int size, String color) {
        this.Size = size;
        this.Color = color;
    }

    @Override
    public String toString() {
        if(this.Size > 0 && this.Color != null) {
            return "It is my " + this.Size + " inches " + this.Color + " ball";
        }
        else if(this.Size > 0) {
            return "It is my " + this.Size + " inches ball";
        }
        else if(this.Color != null) {
            return "It is my " + this.Color + " ball";
        }
        else {
            return "It is my ball!";
        }
    }
}
