package com.droidcatru.Practice514;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    private static String PrintNum(long n) {
        String out = "";
        if(n >= 10) {
            int deg = 0;
            while(n > pow(10, deg)) {
                deg++;
            }
            out += (int)(n / pow(10, deg-1)) + " ";
            return out + PrintNum((int)(n % pow(10, deg-1)));
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
        System.out.println(PrintNum(n));
    }
}
