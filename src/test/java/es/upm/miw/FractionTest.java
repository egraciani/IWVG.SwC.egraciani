package es.upm.miw;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction obj;
    
    @Before
    public void Before() {
        obj = new Fraction(10,5);
    }
    @Test
    public void testGetNumerator() {
        assertEquals(10,obj.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(5,obj.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2,obj.decimal(),2);
    }
    
    @Test
    public void testMultiply() {
        Fraction fraction = new Fraction(1,2);
        assertEquals(1, obj.multiply(fraction), 10e-5);
    }
    
//    @Test
//    public void testDivide() {
//        Fraction divisor = new Fraction(2, 5);
//        Fraction result = new Fraction(50, 10);
//        assertEquals(result.getNumerator(), obj.divide(divisor).getNumerator());
//        assertEquals(result.getDenominator(), obj.divide(divisor).getDenominator());
//    }
    
//    @Test
//    public void isPropia() {
//        Fraction fraction = new Fraction(2, 5);
//        Fraction fraction2 = new Fraction(7, 3);
//        assertEquals(fraction.isPropia(), true);
//        assertEquals(fraction2.isPropia(), false);
//    }
    
}