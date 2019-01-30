package com.lambda.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientesPorEstadoLambda {
	
	public static Map<String, List<Cliente>> agrupaPorEstado(List<Cliente> clientes) {
		
//		return clientes.stream()
//				.collect(Collectors.groupingBy(cli -> cli.getEstado()));
		
		return clientes.stream()
				.collect(Collectors.groupingBy(Cliente::getEstado));
		
//		Map<String, List<Cliente>> porEstado = new HashMap<>();
//		for (Cliente cli : clientes) {
//			String estado = cli.getEstado();
//			
//			List<Cliente> clientesEstados = porEstado.get(estado);
//			
//			if (clientesEstados == null) {
//				clientesEstados = new ArrayList<>();
//				porEstado.put(estado, clientesEstados);
//			}
//			
//			clientesEstados.add(cli);
//		}
//		return porEstado;
	}
	
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("José", "Campinas", "SP"));
		clientes.add(new Cliente("Pedro", "Campinas", "SP"));
		clientes.add(new Cliente("João", "São Paulo", "SP"));
		clientes.add(new Cliente("Ana", "Recife", "PE"));
		clientes.add(new Cliente("Fabiana", "Campo Grande", "MS"));
		clientes.add(new Cliente("Cristiane", "Rio de Janeiro", "RJ"));
		clientes.add(new Cliente("Fabricio", "Campinas", "SP"));
		clientes.add(new Cliente("Julia", "Campo Grande", "MS"));
		clientes.add(new Cliente("Fábio", "São Paulo", "SP"));
		
		Map<String, List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);
		
		for (String estado : clientesPorEstado.keySet()) {
			System.out.println(estado + ": " + clientesPorEstado.get(estado));
		}
	}

}
