package model;

public class Usuario {

	private String login;
	private String senha;
	private int tipo;

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	
	retValue = "Login:" + ENTER +
	super.toString()+
	"Usu�rio: " + login + ENTER +
	"Senha: " + senha + ENTER +
	"Tipo: " + tipo + ENTER;
	
	return retValue;
	}

	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;

	}

	public Usuario() {
		super();
	}
}