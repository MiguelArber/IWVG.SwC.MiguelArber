package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Fraction;

public class FractionTest {

	private Fraction f, f1, f2;

	@Before
	public void before() {
		f = new Fraction(1, 2);
		f1 = new Fraction();
		f2= new Fraction(2, 2);
	}

	@Test
	public void testFractionNumerator() {
		assertEquals(1, f.getNumerator());
		assertEquals(1, f1.getNumerator());
	}

	@Test
	public void testFractionDenominator() {
		assertEquals(2, f.getDenominator());
		assertEquals(1, f1.getDenominator());
	}

	@Test
	public void testFractionDecimal() {
		assertEquals(0.5, f.decimal(), 0.0001);
		assertEquals(1, f1.decimal(), 0.0001);
	}

	@Test
	public void testIsSmallerFraction() {
		assert (f.isSmaller(f1));
	}

	@Test
	public void testIsSmallerDouble() {
		assert (f.isSmaller(0.85));
	}
	
	@Test
    public void testIsGreaterFraction() {
        assert (f1.isGreater(f));
    }

    @Test
    public void testIsGreaterDouble() {
        assert (f1.isGreater(0.85));
    }
    
    @Test
    public void testIsEqualFraction() {
        assert (f1.isEqual(f2));
    }

    @Test
    public void testIsEqualDouble() {
        assert (f.isEqual(0.5));
    }
}
