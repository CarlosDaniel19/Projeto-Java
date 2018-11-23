package model;

public class Usuario {
	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", login=" + login + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + ", telefone=" + telefone + ", getMatricula()=" + getMatricula() + ", getLogin()="
				+ getLogin() + ", getSenha()=" + getSenha() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// Construtor padr�o da Classe.
	// Objeto vazio para o momento que o usu�rio ainda n�o cadastrou dados.
	public Usuario() {
		super();
		// super faz refer�ncia � super classe.
		// Toda classe java � sub classe da classe Object.

	}

	// Construtor com atributos da Classe. Ser� utilizado para o usu�rio efetuar o
	// cadastro.
	public Usuario(int matricula, String login, String senha, String nome, String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
}
