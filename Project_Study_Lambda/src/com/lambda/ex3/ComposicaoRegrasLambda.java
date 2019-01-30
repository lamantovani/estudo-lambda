package com.lambda.ex3;

import java.util.function.Predicate;

public class ComposicaoRegrasLambda {
	
	public static void avaliar(Cliente cli, Predicate<Cliente> regra) {
		String resultado = regra.test(cli) ? "aceito" : "recusado";
		System.out.println("Resultado: " + resultado);
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("José", 5000.0, 2, false, true);
		
		Predicate<Cliente> regraSalario = cli -> cli.getSalario() > 2000.0;
		Predicate<Cliente> regraTempoEmpregado = cli -> cli.getTempoEmprego() > 0;
		Predicate<Cliente> regraPagamentoAtraso = cli -> !cli.isPagamentosAtraso();
		Predicate<Cliente> regraSPC = cli -> !cli.isRestricoesSPC();
		
		//avaliar(cliente, new RegraSalario(new RegraSPC()));
		avaliar(cliente, regraSalario.and(regraSPC));

		//avaliar(cliente, new RegraSalario(new RegraTempoEmprego(new RegraSPC())));
		avaliar(cliente, regraSalario.and(regraTempoEmpregado).and(regraSPC));

		//avaliar(cliente, new RegraTempoEmprego(new RegraPagamentoAtraso()));
		avaliar(cliente, regraTempoEmpregado.and(regraPagamentoAtraso));
	
		//avaliar(cliente, new RegraSPC(new RegraSalario(new RegraTempoEmprego(new RegraPagamentoAtraso()))));
		avaliar(cliente, regraSPC.and(regraSalario).and(regraTempoEmpregado).and(regraPagamentoAtraso));
	}

}
