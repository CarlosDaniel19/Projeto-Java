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
		ccc.setNumeroNote(31);
		ccc.setModelo("Dell");
		ccc.setPrecoUnitario(1999.99);
		ccc.setFigura("klapaucius");
		ccc.setDataCadastro("18/11/2018");
		ccc.setDescricao("Notebook |Dell");
		ccc.setEstoque(15);

		System.out.println(ccc.toString());

		Notebook ccc1 = new Notebook();
		ccc1.setNumeroNote(72);
		ccc1.setModelo("HP");
		ccc1.setPrecoUnitario(1799.99);
		ccc1.setFigura("galuba");
		ccc1.setDataCadastro("18/11/2018");
		ccc1.setDescricao("Notebook HP");
		ccc1.setEstoque(14);

		System.out.println(ccc1.toString());

		Notebook ccc2 = new Notebook();
		ccc2.setNumeroNote(61);
		ccc2.setModelo("AlienWare");
		ccc2.setPrecoUnitario(3999.99);
		ccc2.setFigura("paskjf");
		ccc2.setDataCadastro("18/11/2018");
		ccc2.setDescricao("Notebook AlienWare");
		ccc2.setEstoque(17);

		System.out.println(ccc2.toString());

		Usuario ddd = new Usuario();
		ddd.setEmail("c_daniel8@hotmail.com");
		ddd.setLogin("daniel");
		ddd.setMatricula(5646218);
		ddd.setNome("Carlos Daniel");
		ddd.setSenha("******");
		ddd.setTelefone("(21)954-985-498");

		System.out.println(ddd.toString());

		Usuario ddd1 = new Usuario();
		ddd1.setEmail("c_daniel9@hotmail.com");
		ddd1.setLogin("daniell");
		ddd1.setMatricula(564656218);
		ddd1.setNome("Carlos Daniell");
		ddd1.setSenha("*******");
		ddd1.setTelefone("(21)954-985-499");

		System.out.println(ddd1.toString());

		Pedido fff = new Pedido();
		fff.setDataEmissao("19/11/2018");
		fff.setFormaDePagamento("Cartão de Crédito");
		fff.setNumero(1);
		fff.setSituacao("Separando do estoque");
		fff.setValorTotal(1999.99);

		System.out.println(fff.toString());

	}

}
