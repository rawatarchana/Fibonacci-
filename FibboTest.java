package com.hva;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FibboTest {
   
    @Test
    //write a test case for initial condition
    public void testFibboForZeroLimit() {
        
        assertEquals(Arrays.asList(0), getLimit(0));//check the condition
        
    }
    @Test

    public void testFibboForOneLimit() {
        
        assertEquals(Arrays.asList(0,1), getLimit(1));
        
    }
    @Test

    public void testFibboForTwoLimit() {
        
        assertEquals(Arrays.asList(0,1,1), getLimit(2));
        
    }
    @Test

    public void testFibboForThreeLimit() {
        
        assertEquals(Arrays.asList(0,1,1,2), getLimit(3));
        
    }
    @Test

    public void testFibboForFourLimit() {
         assertEquals(Arrays.asList(0,1,1,2,3), getLimit(5));
        
    }
   /*  @Test /* for very huge number 
    public void nextNumberIshuge() {
        assertTrue(getLimit(10000000000).size() >10000000000);

    } */
    public ArrayList<Integer> getLimit(int limit) {
        Fibbo fibbo = new Fibbo();//create a fibbo object in Fibbo class
        return fibbo.perform(limit);//calling the function and return the ArrayList<Integer>
    }
    
}
