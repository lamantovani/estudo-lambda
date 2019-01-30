package com.lambda.curso.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamMain2 {
	
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		for (String s : lista) {
			if (condicao.test(s)) {
				System.out.println(s);
			}
		}
	}
	
	public static void main(String[] args) {
	
		List<String> lista1 = Arrays.asList("Santa Catarian", "Parana", "São Paulo", "Rio de Janeiro", "Brasilia", "Ceará");
		
		System.out.println("Estados que iniciam com a letra 'S' \n");
		filtro(lista1, (s) -> s.startsWith("S"));
		
		
		System.out.println("Estados que iniciam com a letra 'a'\n");
		filtro(lista1, (s) -> s.endsWith("a"));
		
		System.out.println("Imprime toda a lista \n");
		filtro(lista1, (s) -> true);
		
		System.out.println("Não Imprime a lista \n");
		filtro(lista1, (s) -> false);
		
		System.out.println("Imprime os nomes com ais de 10 caracteres");
		filtro(lista1, (s) -> s.length() > 10);
	}
	
	

}
