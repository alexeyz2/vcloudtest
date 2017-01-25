package com.az.vlcoudtest;

import java.util.Collections;

public class Main {

    public boolean doIt() {
        System.out.println("Hellow World!");
        System.out.println("Its a bit vCloudy today");
        System.out.println("Thanks to God its Friday");

        Collections.emptyList().forEach(System.out::println);

        return true;
    }

    public static void main(String[] args) {
        new Main().doIt();
    }
}
