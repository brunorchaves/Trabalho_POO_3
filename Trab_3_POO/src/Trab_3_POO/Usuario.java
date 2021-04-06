package Trab_3_POO;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner; 
import java.util.ArrayList;

public class Usuario {
	
	private String login;
	private String nome;
	private String email ;
	private String dataNascimento;
	private ArrayList<String> seguidores = new ArrayList<String>();
	private ArrayList<String> seguidos = new ArrayList<String>();
	//private static HashMap<String, Integer> seguindo = new HashMap<String,Integer>() ;
	//Lista de seguidores
	//Lista de Publica

	public Usuario(String login, String nome, String email, String dataNascimento, ArrayList<String> seguidores,
			ArrayList<String> seguidos) {
		super();
		this.login = login;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.seguidores = seguidores;
		this.seguidos = seguidos;
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
	//Seguidores
	public ArrayList<String> getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(ArrayList<String> seguidores) {
		this.seguidores = seguidores;
	}
	
	public void addSeguidores(String seguidor) 
	{
		
		if(this.seguidores.contains(seguidor))
		{
			System.out.println("Esse usuario ja esta aqui");
		}
			
		else
		{
			this.seguidores.add(seguidor);
		}
		
		
	}

	public ArrayList<String> getSeguidos() {
		return seguidos;
	}

	public void setSeguidos(ArrayList<String> seguidos) {
		this.seguidos = seguidos;
	}
	
	public void addSeguidos(String seguido) 
	{	
	
		this.seguidos.add(seguido);	
		
	}
	

}
