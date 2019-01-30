package com.lambda.ex3;

public class ComposicaoRegras {
	
	public static void avaliar(Cliente cli, Regra regra) {
		String resultado = regra.aplicar(cli) ? "aceito" : "recusado";
		System.out.println("Resultado: " + resultado);
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("José", 5000.0, 2, false, true);
		
		avaliar(cliente, new RegraSalario(new RegraSPC()));
		
		avaliar(cliente, new RegraSalario(new RegraTempoEmprego(new RegraSPC())));
		
		avaliar(cliente, new RegraTempoEmprego(new RegraPagamentoAtraso()));
		
		avaliar(cliente, new RegraSPC(new RegraSalario(new RegraTempoEmprego(new RegraPagamentoAtraso()))));
	}

}
