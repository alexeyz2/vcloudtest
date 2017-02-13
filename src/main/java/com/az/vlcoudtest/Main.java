package com.az.vlcoudtest;

public class Main {

    Main() {
        nonFinalMethod("11");
    }

    void nonFinalMethod(String s1) {
        s1 = "222";
        s1 = "222";
    }

    long v1 = 2 * 100;

    public boolean doIt() {
        System.out.println("Hellow World!");
        System.out.println("Its a bit vCloudy today");
        System.out.println("Thanks to God its Friday");

        System.out.println("vCloud knows how to wait...");

        return true;
    }

    public static void main(String[] args) {
        new Main().doIt();
    }
}
