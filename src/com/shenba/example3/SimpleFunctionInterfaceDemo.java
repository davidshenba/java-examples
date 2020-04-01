package com.shenba.example3;

import java.util.function.Function;

public class SimpleFunctionInterfaceDemo {
	
	private static String greet(String name, Function<String, String> decorator) {
		String greetings = "Hi Mr. " + name + "!";
		String decoratedGreetings = decorator.apply(greetings);
		return decoratedGreetings;
	}
	
	private static String greetInTamil(String greetings) {
		greetings = greetings.replace("Hi ", "Vanakkam ");
		greetings = greetings.replace("Mr. ", "Thiru. ");
		return greetings;
	}
	
	public static void main(String[] args) {
		//Now I am using the static method reference
		System.out.println(greet("Pandian", SimpleFunctionInterfaceDemo::greetInTamil));
		//Now I am using an anonymous method to greet a woman
		System.out.println(greet("Selvi", greetings -> greetings = greetings.replace("Mr. ", "Mrs. ")));
	}

}
