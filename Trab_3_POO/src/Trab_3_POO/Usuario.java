package Trab_3_POO;

import java.util.Calendar;
import java.util.HashMap;

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
	
	
	
}
