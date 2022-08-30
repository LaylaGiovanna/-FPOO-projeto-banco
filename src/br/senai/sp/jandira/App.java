package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Conta contaDaLayla = new Conta();
		Conta contaDoJoao = new Conta();
		
		contaDaLayla.numero = "001-8";
		contaDaLayla.cliente = "Layla Giovanna";
		contaDaLayla.tipoConta = "Corrente";
		contaDaLayla.saldo = 2000;
		
		contaDoJoao.numero = "002-4";
		contaDoJoao.cliente = "João Sousa";
		contaDoJoao.tipoConta = "Poupança";
		contaDoJoao.saldo = 90;
		
		contaDaLayla.exibirDadosDaConta();
		
		contaDoJoao.exibirDadosDaConta();
		
		

	}

}
