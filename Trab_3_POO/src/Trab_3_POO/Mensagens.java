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
	
	
	public void addComentario(String comentario,int index)
	{
		int tamanho = this.publiComent.size();
		this.publiComent.get(index).add(comentario);
	}
	public void removeComent(int index[])
	{
		for(int i =0;i< index.length;i++)
		{
			if(index[i]==1 )
				this.publiComent.get(i).remove(i);
		}
		
	}
	
	
	
}
