package factorial;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Factorial {
	int calls;

	public int getCalls() {
		return calls;
	}

	public static void main(String[] args) {
		long i;
		int number = 20;// It is the number to calculate factorial
		// for (i = 1; i <= number; i++) {
		// fact = fact * i;
		// }

		System.out.println("Factorial of " + number + " is: " + new Factorial().calcFactorial(number));

		JUnitCore runner = new JUnitCore();
		Result result = runner.run(FactorialTest.class);
		System.out.println("run tests: " + result.getRunCount());
		System.out.println("failed tests: " + result.getFailureCount());
		System.out.println("ignored tests: " + result.getIgnoreCount());
		System.out.println("success: " + result.wasSuccessful());

	}

	public long calcFactorial(int n) {
		calls++;
		if (n < 0 || n > 20) {
			throw new IllegalArgumentException("Factorials are defined only on non-negative integers.");
		}
		long result = 1;

		if (n < 2) {
			return result;
		} else {
			return (n * calcFactorial(n - 1));
		}
	}

}
