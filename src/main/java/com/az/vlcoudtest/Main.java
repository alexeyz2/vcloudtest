package com.az.vlcoudtest;

public class Main {

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
    }

    long v1 = 2 * 100;

    int i2 = 2 * 10000000;

    public String str = "";


    public boolean doIt() {
        System.out.println("Hellow World!");
        System.out.println("Its a bit vCloudy today");
        System.out.println("Thanks to God its Friday");

        System.out.println("vCloud knows how to wait...");
        System.out.println("on-premise...");
        return true;
    }

    public static void main(String[] args) {
        new Main().doIt();
    }
}
