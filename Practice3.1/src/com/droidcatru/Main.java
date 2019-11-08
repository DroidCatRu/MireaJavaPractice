package com.droidcatru;

public class Main {

    public static void main(String[] args) {
	    Shape mySweetCircle = new Circle(3.0, true, "red");
	    Shape mySweetRect = new Rectangle(2, 5, true, "blue");

	    System.out.println(mySweetCircle);
	    System.out.println("Circle's area: " + mySweetCircle.getArea() + " and perimeter: " + mySweetCircle.getPerimeter());

        System.out.println(mySweetRect);
        System.out.println("Rectangle's area: " + mySweetRect.getArea() + " and perimeter: " + mySweetRect.getPerimeter());
    }
}
