package com.example.subhash.fragment;

import com.example.subhash.JUnitTesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    JUnitTesting jUnitTesting=new JUnitTesting();
    @Test
    public void addition_isCorrect() {

        assertEquals(4, 2 + 2);
        assertNotEquals(8, 4+5);
    }
    @Test
    public void add()
    {
        assertEquals(12,jUnitTesting.add(8,4));
    }
}