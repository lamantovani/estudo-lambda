package com.lambda.financeiro.email;

public class EnviadorEmail {
	
	public void enviar(String to, String text) {
		System.out.printf("Enviando e-mail para %s. O text: %s \n", to, text );
	}
}
