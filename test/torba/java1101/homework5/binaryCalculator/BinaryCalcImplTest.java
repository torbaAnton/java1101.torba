package torba.java1101.homework5.binaryCalculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BinaryCalcImplTest {
    private Calc calc;

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("BeforeClass  BinaryCalcImplTest.class");
    }
    @org.junit.Before
    public void setUp() throws Exception {
        calc = new BinaryCalcImpl();

    }

    @org.junit.After
    public void tearDown() throws Exception {
        calc = null;
    }

    @org.junit.Test
    public void sum() {
        assertEquals(10110, parseInt(calc.sum(8,14)));
    }

    @org.junit.Test
    public void minus() {
        assertEquals(10110, parseInt(calc.minus(42,20)));
    }

    @org.junit.Test
    public void multiplication() {
        assertEquals(10110,parseInt(calc.multiplication(11,2)));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void divide() {
        assertEquals(10110, parseInt(calc.divide(44,0),0));
    }
    @org.junit.Test
    public void dividePositive() {
        assertEquals(10110, parseInt(calc.divide(44,2)));
    }
    @org.junit.Test
    public void divideNegative() {
        assertNotEquals(10110, parseInt(calc.divide(44,1)));
    }

    @org.junit.Test
    public void getPercent() {
        assertEquals(10110, parseInt(calc.getPercent(220,10)));
    }

    @org.junit.Test
    public void pow() {
        assertEquals(11011, parseInt(calc.pow(3,3)));
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("AfterClass BinaryCalcImplTest.class");
    }
}