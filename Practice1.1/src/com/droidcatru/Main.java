package com.droidcatru;

public class Main {

    public static void main(String[] args) {
	    Dog dog1 = new Dog("Mattew", 3);
	    Dog dog2 = new Dog();
	    dog2.setName("Billy");
	    dog2.setAge(5);
	    Dog dog3 = new Dog("Pitt");
	    dog3.setAge(8);
	    Dog dog4 = new Dog(10);
	    dog4.setName("Candy");

        System.out.println(dog1);
        System.out.println(dog1.inHumanAge());
        System.out.println(dog2.getName());
        System.out.println(dog3.getAge());
    }
}
