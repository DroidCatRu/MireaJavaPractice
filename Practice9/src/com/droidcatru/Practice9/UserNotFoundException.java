package com.droidcatru.Practice9;

public class UserNotFoundException extends Exception {
    UserNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
