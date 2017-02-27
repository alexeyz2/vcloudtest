package com.az.vlcoudtest;


import com.sun.tools.javac.main.JavaCompiler;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.startsWith;

public class MainTest {
    @org.junit.Test
    public void testDoIt() throws Exception {
        boolean result = new Main().doIt();

        String javacV = JavaCompiler.version();
        Assert.assertThat(javacV, startsWith("1.8"));

        Assert.assertTrue(result);
    }
}