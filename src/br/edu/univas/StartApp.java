package br.edu.univas;

import br.edu.univas.models.*;

public class StartApp {
	public static void main(String[] args) {
		ContaCorrente contaPrincipal = new ContaCorrente("Lucca", "123.456.789-00", "123456");
		contaPrincipal.depositar(4000);
		contaPrincipal.depositar(3000);
		contaPrincipal.getExtrato();
		ContaCorrente contaTeste = new ContaCorrente("Teste", "987.654.321-00", "654321");
		contaTeste.depositar(4000);
		contaTeste.getExtrato();
		System.out.println(contaPrincipal.toString());
	}
}