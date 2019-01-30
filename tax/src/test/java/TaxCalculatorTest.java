/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TaxCalculatorTest {
    
   // public TaxCalculatorTest() {
    //}

    @Test
    public void testCalc() {
       TaxCalculator tax = new TaxCalculator();
       assertEquals(0, tax.calc(1), 0); //assertEquals( 
    }
    
}
