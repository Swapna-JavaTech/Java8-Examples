package com.hexaware.java8examples.streamapiexamples;

import java.util.stream.Stream;

public class StreamForEachDemo {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(45,32,55,21,66,22,11,55,78);
		System.out.println("using streams and for each.....");
		stream.forEach(streamValue -> System.out.println(streamValue));
		
		//traditional for loop
		int arrayValues[] = {45,32,55,21,66,22,11,55,78};
		System.out.println("Using Array and For loop....");
		for(int i:arrayValues) {
			System.out.println(i);
		}

	}

}
