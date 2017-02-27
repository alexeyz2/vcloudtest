package com.az.vlcoudtest;

import java.util.stream.Stream;

public class Main implements IInterface {

    Main() {
        nonFinalMethod("11");
    }

    void nonFinalMethod(String s1) {
        s1 = "222"; s1 = "333"; s1 = "222";

        try {
            wait(1);
        } catch (InterruptedException e) {
            // Swallow
        }

        if (true) {
            System.out.println();
        }
    } long v1 = 2 * 100;

    int i2 = 2 * 10000000;
    int i3 = 0 * 10000011;

    public String str = "";

    @Override
    public boolean doIt() {
        System.out.println("Hellow World!");
        System.out.println("Its a bit vCloudy today");
        System.out.println("Thanks to God its Friday");

        System.out.println("vCloud knows how to wait...");
        System.out.println("on-premise commit test...");

        // Java8 feature
        Stream.of("").findFirst();

        return true;
    }

    public static void main(String[] args) {
        new Main().doIt();
    }
}
