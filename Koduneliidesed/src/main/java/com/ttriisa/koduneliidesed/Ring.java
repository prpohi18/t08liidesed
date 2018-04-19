/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttriisa.koduneliidesed;

/**
 *
 * @author zeus
 */
public class Ring implements RingLiidesed{
    @Override
    public double umbermoot(double raadius){
        double umbermoot = 2 * Math.PI * raadius;
        return umbermoot;   
    }

    @Override
    public double pindala(double raadius) {
        double pindala = Math.PI * Math.pow(raadius, 2);
        return pindala;
    }
    
}
