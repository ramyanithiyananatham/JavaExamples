//package com.tutorial.java;

import java.util.Scanner;

/*Exceptions-When an error occurs, Java will normally stop and generate an error message
 * The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException, class not found etc. they are checked at compile-time.
 *The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. they are checked at runtime.
 * Error is irrecoverable e.g. OutOfMemoryError, stackoverflow, VirtualMachineError, AssertionError etc.
 * throw used to create an userdefinedexception object and throw it. 
 * Throws is used in method definition, to declare that a risky method is being called. 
 * try catch finally,throws

*/

public class TestExceptions {
	public static void main(String[] args) {
		TestExceptions t = new TestExceptions();
		t.tryCatchFinally();
		t.custonException();
		try {
			t.throwcheckAge();// skips try, if exception throwed

			// since throwsCheckAge() gives an information to the programmer that there may
			// occur an exception. so as programmer handling it
			t.throwsCheckAge(13);

		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("Exceptions Done");
	}

	void tryCatchFinally() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

	void custonException() {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code in custom exception...");
	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	void throwcheckAge() {
		System.out.println(" enter the throwage");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		s.close();
		if (i < 18) {
			// System.out.println("Throw execution using throwcheckAge()");
			throw new ArithmeticException("throwcheckAge.");

		} else {
			System.out.println("Access granted - You are old enough!");
		}

	}

	void throwsCheckAge(int age) throws ArithmeticException {
		if (age < 18) {
			// System.out.println("Throws execution ");
			throw new ArithmeticException("Throws execution.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}