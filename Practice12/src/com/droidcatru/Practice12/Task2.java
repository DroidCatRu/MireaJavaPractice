package com.droidcatru.Practice12;

import java.util.StringTokenizer;

class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String flat;

    public Address(String fullAddress) {
        String[] temp = new String[6];
        temp = fullAddress.split(",");
        country = temp[0];
        region = temp[1];
        town = temp[2];
        street = temp[3];
        house = temp[4];
        flat = temp[5];
    }

    public Address(String fullAddress, String token) {
        StringTokenizer tokenizer = new StringTokenizer(fullAddress, token);
        country = tokenizer.nextToken();
        region = tokenizer.nextToken();
        town = tokenizer.nextToken();
        street = tokenizer.nextToken();
        house = tokenizer.nextToken();
        flat = tokenizer.nextToken();
    }

    public String getTown() {
        return town;
    }

}

public class Task2 {
    public static void main(String[] args) {
        Address address1 = new Address("strana,region,gorod,ulica,dom,kvar");
        Address address2 = new Address("strana,region.gorod/ulica:dom-kvar", ",./:-");
        System.out.println(address1.getTown());
        System.out.println(address2.getTown());
    }
}
