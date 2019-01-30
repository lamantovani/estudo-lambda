package com.lambda.financeiro.exemplo;

import java.util.List;

import com.lambda.financeiro.Fatura;
import com.lambda.financeiro.dao.FaturaDAO;
import com.lambda.financeiro.email.EnviadorEmail;

public class Exemplo {
	
	public static void main(String[] args) {
		
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		for (Fatura fatura : faturasVencidas) {
			enviadorEmail.enviar(fatura.getEmailDevedor(), fatura.getResumo());
		}
		
		faturasVencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.getResumo()));
		
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.getResumo());
			f.setNotificaoEnviada(true);
		});
		
	}

}
