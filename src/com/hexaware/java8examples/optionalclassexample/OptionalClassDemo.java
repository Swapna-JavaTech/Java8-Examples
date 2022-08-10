package com.hexaware.java8examples.optionalclassexample;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClassDemo {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Optional.empty() returns an empty Optional
		 */
		
		Optional<Integer> emptyOptional  = Optional.empty();
		System.out.println(emptyOptional);
		
		/*
		 * value present in Optional class
		 */
		Optional<String> valueInOptional  = Optional.of("Rama");
		System.out.println(valueInOptional);
		
		System.out.println(valueInOptional.get());
		
		/*
		 * value is present or not
		 */
		if(emptyOptional.isPresent()) {
			System.out.println("Value is present = "+emptyOptional);
		} else {
			System.out.println("Empty Optional Object");
		}
		
		Optional<String> nonEmptyOptional = Optional.of("James Gosling");
		Optional<String> EmptyOptional = Optional.empty();
		System.out.println(nonEmptyOptional.orElseThrow(() -> new Exception("Value not found")));
		System.out.println(EmptyOptional.orElseThrow(() -> new Exception("Value not found..........")));

	
	}

}
