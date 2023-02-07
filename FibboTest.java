package com.hva;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibboTest {
   
    @Test

    public void testFibbo() {
        Fibbo fibbo = new Fibbo();
        
        
        System.out.println(fibbo.perform(5));
        
    }
    
}
