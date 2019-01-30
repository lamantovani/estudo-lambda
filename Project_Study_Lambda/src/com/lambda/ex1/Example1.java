package com.lambda.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Example1 {

	
	public static void main(String[] args) throws IOException {
		Example1();
		Example2();
		SolutionLambda1();
		
	}
	
	public static void Example1() throws IOException {
		String palavra = "SILVA";
		String arquivo = "/Users/lucasmantovani/Documents/Lucas M/ESTUDO-LAMBDA/nomes.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))) {
			long contador = 0;
			
			String linha = null;
			
			while ((linha = bufferedReader.readLine()) != null) {
				if (linha.contains(palavra)) {
					contador++;
				}
			}
			
			System.out.printf("Example1: A palavra [%s] ocorreu %d vezes \n", palavra, contador);
		}
		
	}
	
	public static void Example2() throws IOException {
		String palavra = "SILVA";
		String arquivo = "/Users/lucasmantovani/Documents/Lucas M/ESTUDO-LAMBDA/nomes.txt";
		
		long contador = 0;
		
		List<String> linhas = Files.readAllLines(Paths.get(arquivo));
		for (String linha : linhas) {
			if (linha.contains(palavra)) {
				contador++;
			}
		}
		System.out.printf("Example2: A palavra [%s] ocorreu %d vezes \n", palavra, contador);
	}
	
	public static void SolutionLambda1() throws IOException {
		String palavra = "SILVA";
		String arquivo = "/Users/lucasmantovani/Documents/Lucas M/ESTUDO-LAMBDA/nomes.txt";
		
		long contador = Files.lines(Paths.get(arquivo))
				.filter(linha -> linha.contains(palavra))
				.count();

		System.out.printf("SolutionLambda1: A palavra [%s] ocorreu %d vezes \n", palavra, contador);
	}
}
