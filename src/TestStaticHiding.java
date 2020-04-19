//package com.tutorial.java;

public class TestStaticHiding {
	// if we can override static method, this should call method from Child class, and cant use super keyword, so here it is method hiding
	public static void main(String args[]) {
		Company cmp = new CrunchifyCompany();
		
		cmp.staticMethod(); // Eclipse should show warning: The static method from the type Company 
			            				//should be accessed in a static way
		cmp.nonStaticMethod();
		
		/*CrunchifyCompany cmp1 = new CrunchifyCompany();
		CrunchifyCompany.staticMethod();
		cmp1.nonStaticMethod();*/
}
}
 
// Comapny: Super-Parent Class
class Company {
 
	// public static method which can not be overridden in Java
	public static void staticMethod() {
		
		System.out.println("Company: Static Instance method");
	}
 
	// non static method
	public void nonStaticMethod() {
		System.out.println("Company: non-Static method");
	}
}
 
// CrunchifyCompany: Sub-Child Class
class CrunchifyCompany extends Company {
	/*
	 * static method of same name and method signature as existed in super
	 * class, this is not method overriding instead this is called method hiding
	 * in Java
	 */
	public static void staticMethod() {
		System.err.println("CrunchifyCompany: Overridden Static Instance method");
		//super.staticmetod(); //cant declare super in static method
	}
	
	// non static method
	public void nonStaticMethod() {
		System.out.println("CrunchifyCompany: non-Static method");
		
		super.nonStaticMethod();
		staticMethod();//print overridden static method
	}
	
}
