package br.com.java;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta contaCorrente =  new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvenstimento = new Conta();
		
		contaCorrente.numero = 3636;
		contaCorrente.saldo = 100.5;
		contaCorrente.cliente.nome = "Hedris";
		contaCorrente.cliente.idade = 24;
		
		contaPoupanca.numero = 2525;
		contaPoupanca.saldo = 200.0;
		contaPoupanca.cliente.nome = "Exemplo 01";
		contaPoupanca.cliente.idade = 30;
		
		contaInvenstimento.numero = 5000;
		contaInvenstimento.saldo = 40.0;
		contaInvenstimento.cliente.nome = "Exemplo 02";
		contaInvenstimento.cliente.idade = 50;
		
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
	}
}
