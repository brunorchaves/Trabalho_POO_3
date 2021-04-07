package Trab_3_POO;

import java.util.ArrayList;

public class Mensagens 
{
	private ArrayList<ArrayList<String>> publiComent = new ArrayList<ArrayList<String>>();

	public Mensagens(ArrayList<ArrayList<String>> publiComent) {
		super();
		this.publiComent = publiComent;
	}

	public ArrayList<ArrayList<String>> getPubliComent() {
		return publiComent;
	}

	public void setPubliComent(ArrayList<ArrayList<String>> publiComent) {
		this.publiComent = publiComent;
	}
	
	public int contaPublicacoes()
	{
		return 0;
		
	}
	public void addMensagemInit(String mensagemInit,int index)
	{
		this.publiComent.get(index).add(mensagemInit);
	}
	
}
