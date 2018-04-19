/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttriisa.koduneliidesed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeus
 */
public class RingTestid {
    Ring ring = new Ring();
    
    @Test
    public void umbermootTest() {        
        assertEquals(12.56, ring.umbermoot(2), 0.01);
        assertEquals(18.84, ring.umbermoot(3), 0.01);
    }

    @Test
    public void pindalaTest() {
        assertEquals(28.27, ring.pindala(3), 0.01);
        assertEquals(50.26, ring.pindala(4), 0.01);
    }
}
