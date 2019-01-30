package com.lambda.financeiro.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.lambda.financeiro.Fatura;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas() {
		
		
		Fatura f1 = new Fatura("joao@joao.com", 350.0, LocalDate.now().minusDays(3));
		Fatura f2 = new Fatura("joao@joao.com", 150.0, LocalDate.now().minusMonths(2).minusDays(2));
		Fatura f3 = new Fatura("joao@joao.com", 200.0, LocalDate.now().minusDays(5));
		
		return Arrays.asList(f1, f2, f3);
		
	}

}
