package com.lambda.ex3;

public class RegraPagamentoAtraso extends CadeiaRegras {

	public RegraPagamentoAtraso() {
		super(null);
	}
	
	public RegraPagamentoAtraso(Regra next) {
		super(next);
	}
	
	public boolean aplicar(Cliente cli) {
		if (!cli.isPagamentosAtraso()) {
			return aplicarProximaRegra(cli);
		}
		return false;
	}
	
}
