package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		Endereco aaa = new Endereco("Rua", "975", "Casa", "Amoreiras", "Rio de Janeiro", "Rio de Janeiro", "123456789");

		ItemDePedido bbb = new ItemDePedido(5, 25.00);

		Notebook ccc = new Notebook(31, "Dell", "Notebook Dell", 15, 1999.99, "klapaucius", "18/11/2018");

		Notebook ccc1 = new Notebook(72, "HP", "Notebook HP", 14, 1799.99, "galuba", "18/11/2018");

		Notebook ccc2 = new Notebook(61, "AlienWare", "Notebook AlienWare", 17, 3999.99, "paskjf", "18/11/2018");

		UsuarioOld ddd = new UsuarioOld(5646218, "daniel", "******", "Carlos Daniel", "c_daniel8@hotmail.com",
				"(21)954-985-498");

		UsuarioOld ddd1 = new UsuarioOld(456498, "José", "*******", "José Escalador", "jose.escalador@hotmail.com",
				"(31) 123-123-456");

		Pedido eee = new Pedido(1, "19/11/2018", "Cartão de Crédito", 1999.99, "Separando do estoque");

//Mostrar Usuário
		aaa.mostrar();

		bbb.mostrar();

		ccc.mostrar();

		ccc1.mostrar();

		ccc2.mostrar();

		ddd.mostrar();

		ddd1.mostrar();

		eee.mostrar();

	}
}
