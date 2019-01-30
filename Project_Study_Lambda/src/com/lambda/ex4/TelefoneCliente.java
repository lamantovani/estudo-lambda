package com.lambda.ex4;

public class TelefoneCliente {
	private String nome;
	private String codigoArea;
	private String telefone;
	
	public TelefoneCliente(String nome, String codigoArea, String telefone) {
		super();
		this.nome = nome;
		this.codigoArea = codigoArea;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", telefone=(" + codigoArea + ")" + telefone + "]";
	}
	
	
	
	
}
