package com.az.vlcoudtest;


import org.junit.Assert;

import static org.hamcrest.CoreMatchers.startsWith;

public class MainTest {
    @org.junit.Test
    public void testDoIt() throws Exception {
        boolean result = new Main().doIt();

        String javaV = System.getProperty("java.version");
        System.out.println("[AZ] Java version: " + javaV);
        Assert.assertThat(javaV, startsWith("1.8"));

        Assert.assertTrue(result);
    }
}