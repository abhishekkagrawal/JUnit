package factorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FactorialTest {

	private Factorial fact;

	@Before
	public void init() {
		fact = new Factorial();
	}

	@After
	public void tearDown() {
		assertNotNull(fact);
		fact = null;

	}

	// @AfterClass
	// public void afterTearDown() {
	// fact = null;
	// assertNull(fact);
	// }

	@Test
	public void calls() {
		// assertEquals(0, fact.getCalls());

		fact.calcFactorial(1);
		assertEquals(1, fact.getCalls());

		fact.calcFactorial(1);
		assertEquals(2, fact.getCalls());
	}

	@Test
	public void factorialOfNumbers() {
		assertTrue(fact.calcFactorial(0) == 1);
		assertTrue(fact.calcFactorial(1) == 1);
		assertTrue(fact.calcFactorial(5) == 120);
	}

	@Ignore
	@Test
	public void todo() {
		assertTrue(fact.calcFactorial(5) == 100);
	}

	//
	// @Test
	// public void factorialOfZeroShouldBeOne() {
	// assertEquals(1, fact.calcFactorial(0));
	// }
	//
	// @Test
	// public void factorialOfOneShouldBeOne() {
	// assertEquals(1, fact.calcFactorial(1));
	// }
	//
	@Test
	public void factorialOfNShouldBeNTimesFactorialOfNMinusOne() {
		for (int i = 2; i <= 12; i++) {
			assertEquals(i * fact.calcFactorial(i - 1), fact.calcFactorial(i));
			System.out.println(i + "! = " + fact.calcFactorial(i));
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorialOfNegativeNumberShouldThrowException() {
		fact.calcFactorial(-1);
		fact.calcFactorial(Integer.MIN_VALUE);
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorialOfNumberGreaterThanTwentyShouldThrowException() {
		fact.calcFactorial(13);
		fact.calcFactorial(20);
		fact.calcFactorial(50);
	}
}
