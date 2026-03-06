package com.roy;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testAddwithPositives() {
        Arithmetic arth = null;

        arth = new Arithmetic();

        int actual = arth.sum(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }

    public void testAddwithNegetives() {
        Arithmetic arth = null;

        arth = new Arithmetic();

        int actual = arth.sum(-10, -20);
        int expected = -30;
        assertEquals(expected, actual);
    }

    public void testAddwithMixed() {
        Arithmetic arth = null;

        arth = new Arithmetic();

        int actual = arth.sum(10, -20);
        int expected = -10;
        assertEquals(expected, actual);
    }

    public void testAddwithZeros() {
        Arithmetic arth = null;

        arth = new Arithmetic();

        int actual = arth.sum(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
