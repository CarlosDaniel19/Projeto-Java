package controller;

import util.Teclado;

import model.*;

public class InfoNote {

	Usuario ddd;
	boolean logado = false;

	public void mostrarMenu() {
		System.out.println("=========================================================");
		System.out.println("          InfoNote - Se n�o � info n�o vendemos          ");
		System.out.println("=========================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook do carrinho");
		System.out.println("6 - Ver carrinho");
		System.out.println("7 - Efetuar compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		} else {
			System.out.println("Login ou senha inv�lido.");
			efetuarLogin();
		}
	}

	public void CadastrarUsuario() {
		System.out.println("=========================================================");
		System.out.println("              InfoNote - Cadastro de Usu�rio             ");
		System.out.println("=========================================================");
		int matricula = Teclado.lerInt("Matr�cula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");
		ddd = new Usuario(matricula, login, senha, nome, email, telefone);

		System.out.println("=========================================================");
		System.out.println("              Usu�rio cadastrado com sucesso             ");
		System.out.println("=========================================================");

		System.out.println(ddd);
	}

	public void buscarNotebook() {
		System.out.println("buscarNotebook - Em Constru��o");
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}

	public static void main(String[] args) {
		InfoNote info = new InfoNote();
		int opcao = 8;
		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua op��o: ");
			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.CadastrarUsuario();
				break;

			case 3:
				info.buscarNotebook();
				break;

			case 4:
				info.manterCarrinho();
				break;

			case 5:
				info.manterCarrinho();
				break;

			case 6:
				info.manterCarrinho();
				break;

			case 7:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Sa�da do sistema.");
				break;

			default:
				System.out.println("Op��o inv�lida!");
			}
			Teclado.lerTexto("pressione  uma tecla para continuar...");
		} while (opcao != 8);
	}

}
