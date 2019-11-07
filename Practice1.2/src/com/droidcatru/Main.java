package com.droidcatru;

public class Main {

    public static void main(String[] args) {
	    Ball myFavoriteRedBall = new Ball("red");
	    Ball myFavoriteInVisibleBall = new Ball(14);
	    Ball myFavoriteUndefinedBall = new Ball();
	    Ball myFavoriteBigBlueBall = new Ball(36, "blue");

	    System.out.println(myFavoriteRedBall);
	    System.out.println(myFavoriteInVisibleBall);
        System.out.println(myFavoriteBigBlueBall);
        System.out.println(myFavoriteUndefinedBall);

        System.out.println("Let's make an invisible ball yellow!");

        myFavoriteInVisibleBall.Color = "yellow";

        System.out.println(myFavoriteInVisibleBall);
    }
}
