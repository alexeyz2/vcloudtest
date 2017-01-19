package com.az.vlcoudtest;


import org.junit.Assert;

public class MainTest {
    @org.junit.Test
    public void testDoIt() throws Exception {
        boolean result = new Main().doIt();

        Assert.assertTrue(result);
    }
}