package com.lambda.ex3;

public class Cliente {
	private String nome;
	private double salario;
	private int tempoEmprego;
	private boolean restricoesSPC;
	private boolean pagamentosAtraso;
	
	public Cliente(String nome, double salario, int tempoEmprego, boolean restricoesSPC, boolean pagamentosAtraso) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.tempoEmprego = tempoEmprego;
		this.restricoesSPC = restricoesSPC;
		this.pagamentosAtraso = pagamentosAtraso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getTempoEmprego() {
		return tempoEmprego;
	}
	public void setTempoEmprego(int tempoEmprego) {
		this.tempoEmprego = tempoEmprego;
	}
	public boolean isRestricoesSPC() {
		return restricoesSPC;
	}
	public void setRestricoesSPC(boolean restricoesSPC) {
		this.restricoesSPC = restricoesSPC;
	}
	public boolean isPagamentosAtraso() {
		return pagamentosAtraso;
	}
	public void setPagamentosAtraso(boolean pagamentosAtraso) {
		this.pagamentosAtraso = pagamentosAtraso;
	}
	
	
}
