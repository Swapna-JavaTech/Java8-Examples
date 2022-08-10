package com.hexaware.java8examples.functionalinterfaceexample;

@FunctionalInterface
public interface Addition {
	
	void add();//SAM
	
	default void print() {
		System.out.println("Hello from default method in Functional Interface");
	}
	
	static void print1() {
		System.out.println("Hello from default method in Functional Interface");
	}
	
}
