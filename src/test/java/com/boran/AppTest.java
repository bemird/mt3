package com.boran;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        // System.out.println("add");
        Integer a = 15;
        Integer b = 20;
        Integer expResult = 35;
        Integer result = App.add(a, b);
        assertEquals(expResult, result);
        assertEquals(null, App.add(15, null));
        assertEquals(null, App.add(null, 15));
        assertEquals(null, App.add(null, null));
        System.out.println("result: " + result + ", " + "expected result: " + expResult);
    }
}
