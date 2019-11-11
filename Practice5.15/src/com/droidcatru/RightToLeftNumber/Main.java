package com.droidcatru.RightToLeftNumber;

import java.util.Scanner;

public class Main {

    private static String ReverseNum(long n) {
        String out = "";
        if(n >= 10) {
            out += n % 10 + " ";
            return out + ReverseNum(n / 10);
        }
        else {
            out += n;
            return out;
        }
    }

    public static void main(String[] args) {
        long n = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLong()) {
            n = scanner.nextLong();
        }
        System.out.println(ReverseNum(n));
    }
}
