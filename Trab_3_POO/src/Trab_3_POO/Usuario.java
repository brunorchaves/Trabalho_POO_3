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
	//private static HashMap<String, Integer> seguindo = new HashMap<String,Integer>() ;
	//Lista de seguidores
	//Lista de Publica
	

	public Usuario(String login, String nome, String email, String dataNascimento, ArrayList<String> seguidores) 
	{
		super();
		this.login = login;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.seguidores = seguidores;
		
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
	
	public void addSeguidores(ArrayList<String> seguidores,String seguidor) {
		boolean contem=false;
		
		for(int i = 0; i< seguidores.size();i++)
		{
			if(seguidores.get(i) == seguidor)
			{
				System.out.println("Esse usuario ja esta aqui");
				contem = true;
			}
			
		}
		if(contem == false)
		{
			seguidores.add(seguidor);
		}
		
		
	}
	
	
	

}
