package com.droidcatru;

public class Main {

    public static void main(String[] args) {
	    Shape mySweetCircle = new Circle(3.0, true, "red");
	    System.out.println(mySweetCircle);
	    System.out.println("Circle's area: " + mySweetCircle.getArea() + " and perimeter: " + mySweetCircle.getPerimeter());
    }
}
