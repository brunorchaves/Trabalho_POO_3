package Trab_3_POO;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner; 


public class Usuario {
	
	private String login;
	private String nome;
	private String email ;
	private String dataNascimento;
	private static HashMap<String, Integer> seguidores = new HashMap<String,Integer>() ;
	//Lista de seguidores
	//Lista de Publica
	public Usuario(String login, String nome, String email, String dataNascimento) {
		super();
		this.login = login;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {

		this.dataNascimento = dataNascimento;
	}
	public static HashMap<String, Integer> getSeguidores() {
		return seguidores;
	}
	public static void setSeguidores(HashMap<String, Integer> seguidores) {
		Usuario.seguidores = seguidores;
	}
	
	
	
}
