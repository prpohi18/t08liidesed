/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erike.autotest;

/**
 *
 * @author erike
 */
public class interestCalculator implements interestCalculatorInterface{
    @Override
    public double interest(double base, double percentage, double duration){
        double interestOutput = base * percentage * duration;
        return interestOutput;
    }
    @Override
    public double interestSum(double base, double percentage, double duration){
        double interestOutput = base + (base * percentage * duration);
        return interestOutput;
    }
}
