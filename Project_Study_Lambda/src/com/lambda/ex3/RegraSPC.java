package com.lambda.ex3;

public class RegraSPC extends CadeiaRegras {
	public RegraSPC() {
		super(null);
	}
	
	public RegraSPC(Regra proximaRegra) {
		super(proximaRegra);
	}
	
	public boolean aplicar(Cliente cli) {
		if (!cli.isRestricoesSPC()) {
			return aplicarProximaRegra(cli);
		}
		return false;
	}
}
