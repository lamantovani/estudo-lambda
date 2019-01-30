package com.lambda.curso.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
	
	public static void main(String[] args) {
	
		List<String> lista1 = Arrays.asList("Santa Catarian", "Parana", "São Paulo", "Rio de Janeiro", "Brasilia", "Ceará");
		
		for (String estado : lista1) {
			System.out.println(estado);
		}
		
		lista1.forEach(x -> System.out.println(x));
		
		lista1.forEach(System.out::println);
	}
	
	

}
