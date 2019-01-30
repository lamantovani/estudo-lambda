package com.lambda.ex3;

public class RegraTempoEmprego extends CadeiaRegras {
	public RegraTempoEmprego() {
		super(null);
	}
	
	public RegraTempoEmprego(Regra next) {
		super(next);
	}
	
	public boolean aplicar(Cliente cli) {
		if (cli.getTempoEmprego() > 0) {
			return aplicarProximaRegra(cli);
		}
		return false;
	}
}
