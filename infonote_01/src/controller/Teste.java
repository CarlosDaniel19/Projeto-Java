package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco aaa = new Endereco();
		aaa.setLogradouro("Rua");
		aaa.setNumero("975");
		aaa.setComplemento("Casa");
		aaa.setBairro("Caquizeiros");
		aaa.setCidade("Rio de Janeiro");
		aaa.setEstado("Rio de Janeiro");
		aaa.setCep("23056070");
		
		System.out.println(aaa.toString());
		
		ItemDePedido bbb = new ItemDePedido();
		bbb.setQtde(5);
		bbb.setSubtotal(25.00);
		
		System.out.println(bbb.toString());
		
		Notebook ccc = new Notebook();
		ccc.set

	}

}
