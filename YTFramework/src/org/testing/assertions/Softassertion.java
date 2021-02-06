package org.testing.assertions;

public class Softassertion {
	public static void assertion(String expected, String Actual) {
		if(expected.equals(Actual))
		{
			System.out.println("Assertion passed");
		}
		else
		{
			System.out.println("Assertion failed");
		}
		
		
	}

}
