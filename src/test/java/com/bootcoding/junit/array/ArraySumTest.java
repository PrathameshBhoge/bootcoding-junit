package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test(){
        ArraySum arraySum= new ArraySum();
        int [] nums={1,2,3,4,5};
        int actualSum = arraySum.getsum(nums);
        int expectedsum= 15;
        assertEquals(actualSum,expectedsum);
    }

    @Test
    public void testNegative(){
        ArraySum arraySum = new ArraySum();
        int [] nums= {-1,-2,-3,-4,-5};
        int actualSum = arraySum.getsum(nums);
        int expectedSum = -15;
        assertEquals(actualSum,expectedSum);
    }

    @Test
    public void max() {
        ArraySum arraySum= new ArraySum();
        int [] arr= {3,6,8,9,10};
        int actual = arraySum.getmax(arr);
        int expected = 10;
        assertEquals(actual,expected);
    }

    @Test
    public void gmax() {
        ArraySum arraySum= new ArraySum();
        int [] arr= {-3,-6,8,-9,-10};
        int actual = arraySum.getmax(arr);
        int expected = 8;
        assertEquals(actual,expected);
    }

    @Test
    public void evenelement(){
        ArraySum arraySum = new ArraySum();
        int arr[]= {12,4,3,6,8,10};
        int[] actual = arraySum.evennumber(arr);
        int[] expected = {12,4,6,8,10};
        assertArrayEquals(actual,expected);
    }


}