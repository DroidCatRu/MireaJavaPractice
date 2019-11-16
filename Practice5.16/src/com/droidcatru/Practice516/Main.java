package com.droidcatru.Practice516;

import java.util.Scanner;

public class Main {

    private static long countMax(long count, long max) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLong()) {
            long n = scanner.nextLong();
            if(n > 0) {
                if(n == max) {
                    count = countMax(count+1, max);
                }
                if(n < max) {
                    count = countMax(count, max);
                }
                if(n > max) {
                    count = countMax(1, n);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countMax(1, 0));
    }
}
